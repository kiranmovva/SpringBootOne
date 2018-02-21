package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeDetailsRepositery extends MongoRepository<Employee, String> {

    List<Employee> findAll();
    
    Employee findOne(String empNo);
 
}