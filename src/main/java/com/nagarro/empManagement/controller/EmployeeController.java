package com.nagarro.empManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.empManagement.constant.Constant;
import com.nagarro.empManagement.entity.Employee;
import com.nagarro.empManagement.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping(value = Constant.ADD_EMP_CONTROLLER_PATH, headers = "Accept=application/json")
	public Employee addEmployee(@RequestBody Employee emp) {
		return employeeService.addEmpDetails(emp);
	}

	@PutMapping(value = Constant.EDIT_EMP_CONTROLLER_PATH, headers = "Accept=application/json")
	public Employee editEmployee(@RequestBody Employee emp) {
		return employeeService.editEmpDetails(emp);
	}

	@GetMapping(value = Constant.GET_EMP_CONTROLLER_PATH, headers = "Accept=application/json")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmpDetails();
	}

}
