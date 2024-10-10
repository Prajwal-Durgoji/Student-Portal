package com.submission.portal.dto;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import jakarta.persistence.Id;

@Document(collection = "assignments")
@Validated
public class Assignment {
	@Id
    private int id;
    
	@NotNull(message = "UserId is compulsory")
    private String userId;
    
	@NotNull(message = "task is compulsory")
    private String task;
    
	@NotNull(message = "AdminId is compulsory")
    private String adminId;
    
    private String status;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
	
    
	
}
