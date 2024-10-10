package com.submission.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import com.submission.portal.dto.Assignment;
import com.submission.portal.dto.User;
import com.submission.portal.service.AssignmentService;
import com.submission.portal.service.UserService;

import java.util.List;

import javax.validation.Valid;

@RestController
@Validated
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;

    @Autowired
    private AssignmentService assignmentService;

    @PostMapping("/register")
    public ResponseEntity<User> registerAdmin(@Valid @RequestBody User user) {
        User savedAdmin = userService.registerUser(user);
        return ResponseEntity.ok(savedAdmin);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        User admin = userService.loginUser(username, password);
        if (admin != null && "ADMIN".equals(admin.getRole())) {
            return ResponseEntity.ok("Admin logged in");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }
    }

    @GetMapping("/assignments")
    public ResponseEntity<List<Assignment>> getAssignments(@RequestParam String adminId) {
        List<Assignment> assignments = assignmentService.getAssignments(adminId);
        return ResponseEntity.ok(assignments);
    }

    @PostMapping("/assignments/{id}/accept")
    public ResponseEntity<Assignment> acceptAssignment(@PathVariable int id) {
        Assignment updatedAssignment = assignmentService.acceptAssignment(id);
        return ResponseEntity.ok(updatedAssignment);
    }

    @PostMapping("/assignments/{id}/reject")
    public ResponseEntity<Assignment> rejectAssignment(@PathVariable int id) {
        Assignment updatedAssignment = assignmentService.rejectAssignment(id);
        return ResponseEntity.ok(updatedAssignment);
    }
    
 // Exception Handler
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getBindingResult().getFieldError().getDefaultMessage());
    }
}