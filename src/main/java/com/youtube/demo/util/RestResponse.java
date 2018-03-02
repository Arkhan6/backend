package com.youtube.demo.util;

public class RestResponse {
	private Integer respondeCode;
	private String message;
	
	public Integer getRespondeCode() {
		return respondeCode;
	}
	public void setRespondeCode(Integer respondeCode) {
		this.respondeCode = respondeCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public RestResponse(Integer respondeCode, String message) {
		super();
		this.respondeCode = respondeCode;
		this.message = message;
	}
	
	public RestResponse() {
		
	}
	
	
}
