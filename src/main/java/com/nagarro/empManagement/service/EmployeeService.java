package com.nagarro.empManagement.service;

import java.util.List;

import com.nagarro.empManagement.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmpDetails();
	public Employee editEmpDetails(Employee emp);
	public Employee addEmpDetails(Employee emp);
}
