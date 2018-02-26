package com.student.service;

import java.io.Serializable;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class StudentInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String stdName;
	private String stdAddress;
	private Long stdPhone;
	private int stdTotalMarks;
	
	public StudentInfo(){
	}
	
	public StudentInfo(String id,String stdName, String stdAddress, Long stdPhone, int stdTotalMarks) {
		super();
		this.id=id;
		this.stdName = stdName;
		this.stdAddress = stdAddress;
		this.stdPhone = stdPhone;
		this.stdTotalMarks=stdTotalMarks;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdAddress() {
		return stdAddress;
	}
	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}
	public Long getStdPhone() {
		return stdPhone;
	}
	public void setStdPhone(Long stdPhone) {
		this.stdPhone = stdPhone;
	}
	
	
	public int getStdTotalMarks() {
		return stdTotalMarks;
	}
	public void setStdTotalMarks(int stdTotalMarks) {
		this.stdTotalMarks = stdTotalMarks;
	}
	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", stdName=" + stdName + ", stdAddress=" + stdAddress + ", stdPhone="
				+ stdPhone + "]";
	} 
	
		
}
