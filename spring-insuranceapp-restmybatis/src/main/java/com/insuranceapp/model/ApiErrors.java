package com.insuranceapp.model;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ApiErrors {
	
	private LocalDateTime localdatetime;
	private int statusCode;
	private String error;
	private HttpStatus status;
	public ApiErrors() {
		super();
	}
	public ApiErrors(LocalDateTime localdatetime, int statusCode, String error, HttpStatus status) {
		super();
		this.localdatetime = localdatetime;
		this.statusCode = statusCode;
		this.error = error;
		this.status = status;
	}
	public LocalDateTime getLocaldatetime() {
		return localdatetime;
	}
	public void setLocaldatetime(LocalDateTime localdatetime) {
		this.localdatetime = localdatetime;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
	

}
