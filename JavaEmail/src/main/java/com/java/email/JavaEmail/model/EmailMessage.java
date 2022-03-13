package com.java.email.JavaEmail.model;

public class EmailMessage {

	private String to_address;
	private String subject;
	private String body;
	
	
	public EmailMessage() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public EmailMessage(String to_address, String subject, String body) {
	
		this.to_address = to_address;
		this.subject = subject;
		this.body = body;
	}
	
	
	public String getTo_address() {
		return to_address;
	}
	public void setTo_address(String to_address) {
		this.to_address = to_address;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
	@Override
	public String toString() {
		return "EmailMessage [to_address=" + to_address + ", subject=" + subject + ", body=" + body + "]";
	}
	
	
	
}
