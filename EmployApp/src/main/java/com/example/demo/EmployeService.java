package com.example.demo;

import java.util.List;

public interface EmployeService {
    
	public Employee getEmployeDetails(String empID);
	
	public Employee updateEmployeDetails(Employee employee);

	public List<Employee> GetAllEmployeeDetails();
}
