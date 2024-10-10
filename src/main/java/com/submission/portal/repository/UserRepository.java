package com.submission.portal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.submission.portal.dto.User;

public interface UserRepository extends MongoRepository<User, Integer> {

	User findByUsernameAndPassword(String username, String password);
    
}
