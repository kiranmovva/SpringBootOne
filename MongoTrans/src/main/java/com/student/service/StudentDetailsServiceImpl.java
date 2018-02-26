package com.student.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.repogitery.StudentDetailsRepogitery;

@Service
public class StudentDetailsServiceImpl implements StudentDetailsService{

	@Autowired
	StudentDetailsRepogitery stdRepogitery;
	
	@Override
	public StudentInfo updateStudentDetails(StudentInfo studentDetails) {
		return stdRepogitery.save(studentDetails);
	}

	@Override
	public List<StudentInfo> GetAllStudentDetails() {
		return stdRepogitery.findAll();
	}

	@Override
	public void deleteSudentInfo(StudentInfo studentDetails) {
		 stdRepogitery.delete(studentDetails);;
	}

	@Override
	public List<StudentInfo> getDestinctionStudentList() {
		return stdRepogitery.findAll().stream()
				.filter(studentInfo->studentInfo.getStdTotalMarks()>400)
				.collect(Collectors.toList());
	}

	@Override
	public StudentInfo getStudentProfile(String stdId) {
		return stdRepogitery.findAll().stream()
				.filter(student->student.getId().equals(stdId))
				.findFirst().orElse(null);
	}

}
