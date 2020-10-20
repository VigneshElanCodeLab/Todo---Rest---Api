package com.javareact.learning.restservice;

public class HelloBean {
private String message;

public  HelloBean( String message ){
	this.message=message;
	
}

@Override
public String toString() {
	return "HelloBean [message=" + message + "]";
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
}
