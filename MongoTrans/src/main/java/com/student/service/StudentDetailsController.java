package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class StudentDetailsController {
	
	@Autowired
	StudentDetailsService studentDetailsService;
	
	@PostMapping("updateStdDetails")
	public StudentInfo updateStudentDetails(@RequestBody StudentInfo studentDetails){
		System.out.println("Employe details "+studentDetails);
		return studentDetailsService.updateStudentDetails(studentDetails);
		
	}

	@GetMapping("getAllStdInfo")
	public List<StudentInfo> GetAllStudentDetails(){
		return studentDetailsService.GetAllStudentDetails();
	}
	
	@DeleteMapping("deleteStdInfo")
	public void deleteSudentInfo(@RequestBody StudentInfo studentDetails){
	    studentDetailsService.deleteSudentInfo(studentDetails);
	}
	
	@GetMapping("getDistStudent")
	public List<StudentInfo> getDestinctionStudentList(){
		return studentDetailsService.getDestinctionStudentList();
	}
	
	@GetMapping("getStudentProfile")
	public StudentInfo getStudentProfile(@RequestParam(value="stdNo",defaultValue="1") String stdNo){
		return studentDetailsService.getStudentProfile(stdNo);
	}
			
}
