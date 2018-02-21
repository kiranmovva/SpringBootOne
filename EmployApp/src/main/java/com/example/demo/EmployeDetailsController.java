package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/Employee")
public class EmployeDetailsController {
	@Autowired
	EmployeService EmployeService;
	
	@Autowired
	EmployeDetailsHelper employeDetailsHelper;
	
	
	@GetMapping("getEmployee")
	public Employee getEmployeDetails(@RequestParam(value="empNo",defaultValue="1")String empNo){
		return employeDetailsHelper.getEmplDetails(empNo);
				
	}
	
	@PostMapping("updateEmployee")
	public ResponseEntity<String> updateEmployeeDetails(@RequestBody Employee employee){
		employeDetailsHelper.updateEmployeList(employee);
		System.out.println(employee);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("getAllEmployee")
	public List<Employee> getAllEmployeeDetails(){
	   return employeDetailsHelper.getALLEmplDetails(); 
	}

}
