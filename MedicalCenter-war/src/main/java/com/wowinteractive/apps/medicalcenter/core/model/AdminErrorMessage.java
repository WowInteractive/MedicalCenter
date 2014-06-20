package com.wowinteractive.apps.medicalcenter.core.model;

public class AdminErrorMessage {
	
	private String error;
	
	private String message;

	public AdminErrorMessage(String error, String message) {
		super();
		this.error = error;
		this.message = message;
	}

	public AdminErrorMessage(String error) {
		super();
		this.error = error;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
