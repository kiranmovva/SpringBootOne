package com.example.demo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Employee implements Serializable {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@NotNull
  @NotEmpty
  @JsonProperty 
  @Id
  private String empNo;
  
  @NotNull
  @NotEmpty
  @JsonProperty 
  private String empname;
  
  @JsonProperty 
  private double empPhno;
  
  @JsonProperty 
  private int empSal;
  
  @JsonProperty 
  private String adress;
  
 
  public Employee() {
	super();
}

public Employee(String empNo, String empname, int empPhno, int empSal, String adress) {
	super();
	this.empNo = empNo;
	this.empname = empname;
	this.empPhno = empPhno;
	this.empSal = empSal;
	this.adress = adress;
  }

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getEmpPhno() {
		return empPhno;
	}

	public void setEmpPhno(double empPhno) {
		this.empPhno = empPhno;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empname=" + empname + ", empPhno=" + empPhno + ", empSal=" + empSal
				+ ", adress=" + adress + "]";
	}
	
	
}
