package com.submission.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.submission.portal.dto.Assignment;
import com.submission.portal.repository.AssignmentRepository;

import java.util.List;

@Service
public class AssignmentService {
    @Autowired
    private AssignmentRepository assignmentRepository;

    public Assignment uploadAssignment(Assignment assignment) {
        assignment.setStatus("pending"); // Default status
        return assignmentRepository.save(assignment);
    }

    public List<Assignment> getAssignments(String adminId) {
        return assignmentRepository.findByAdminId(adminId);
    }

    public Assignment acceptAssignment(int id) {
        Assignment assignment = assignmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Assignment not found"));
        assignment.setStatus("accepted");
        return assignmentRepository.save(assignment);
    }

    public Assignment rejectAssignment(int id) {
        Assignment assignment = assignmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Assignment not found"));
        assignment.setStatus("rejected");
        return assignmentRepository.save(assignment);
    }
}