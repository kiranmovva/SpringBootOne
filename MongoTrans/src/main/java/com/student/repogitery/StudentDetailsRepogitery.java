package com.student.repogitery;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.student.service.StudentInfo;

@Repository
public interface StudentDetailsRepogitery extends MongoRepository<StudentInfo, Serializable>{
	
}
