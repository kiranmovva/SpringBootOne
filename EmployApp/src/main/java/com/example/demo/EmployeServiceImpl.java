package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeServiceImpl implements EmployeService{

	@Autowired
	EmployeDetailsHelper employDetailsHelper;
	
	
	@Override
	public Employee getEmployeDetails(String empID) {
		return employDetailsHelper.getEmplDetails(empID);
	}

	@Override
	public Employee updateEmployeDetails(Employee employee) {
		Employee emp= employDetailsHelper.updateEmployeList(employee);
		return emp;
	}

	@Override
	public List<Employee> GetAllEmployeeDetails() {
		return employDetailsHelper.getALLEmplDetails();
	}

	
	
}
