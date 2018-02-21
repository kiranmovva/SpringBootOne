package com.example.demo;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public EmployeeNotFoundException(String errorMsg){
		super(errorMsg);
	}
	
	

}
