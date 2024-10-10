package com.submission.portal.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.submission.portal.dto.Assignment;

public interface AssignmentRepository extends MongoRepository<Assignment, Integer> {
    List<Assignment> findByAdminId(String adminId);
}