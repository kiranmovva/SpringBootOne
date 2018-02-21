package com.example.demo;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeDetailsControlerAdvice {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ErrorResponse handelEmployeeNotFoundException(EmployeeNotFoundException empNotFoundEx){
		ErrorResponse errorResp= new ErrorResponse("100045",empNotFoundEx.getMessage());
		return errorResp;
	}
}
