package com.submission.portal.dto;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import jakarta.persistence.Id;

@Document(collection = "users")
@Validated
public class User {
    @Id
    private int id;
    
    @NotNull(message = "User Name is compulsory")
    private String username;
    
    @NotNull(message = "Password is compulsory")
    private String password;
    
    @NotNull(message = "role is compulsory")
    private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
    
    
}