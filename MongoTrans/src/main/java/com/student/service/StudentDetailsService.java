package com.student.service;

import java.util.List;

public interface StudentDetailsService {
	
	public StudentInfo updateStudentDetails(StudentInfo studentDetails);

	public List<StudentInfo> GetAllStudentDetails();
	
	public void deleteSudentInfo(StudentInfo studentDetails);
	
	public List<StudentInfo>  getDestinctionStudentList();
	
	public StudentInfo getStudentProfile(String rankRange);
			
}
