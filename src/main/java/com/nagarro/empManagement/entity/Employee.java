package com.nagarro.empManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@Column(name = "EmpCode")
	private String empCode;
	
	@Column(name = "EmpName")
	private String empName;
	
	@Column(name = "EmpDob")
	private String empDob;
	
	@Column(name = "EmpLocation")
	private String empLocation;
	
	@Column(name = "EmpEmail")
	private String empEmail;
	
	
	public Employee() {
		super();
	}
	
	
	
	public Employee(String empCode, String empName, String empDOB, String empLocation, String empEmail) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.empDob = empDOB;
		this.empLocation = empLocation;
		this.empEmail = empEmail;
	}


	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDOB() {
		return empDob;
	}
	public void setEmpDOB(String empDOB) {
		this.empDob = empDOB;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	
	
}
