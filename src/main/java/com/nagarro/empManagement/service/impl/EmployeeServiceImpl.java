package com.nagarro.empManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.empManagement.constant.Constant;
import com.nagarro.empManagement.dao.EmployeeDetailsDAO;
import com.nagarro.empManagement.entity.Employee;
import com.nagarro.empManagement.exception.EmptyInputException;
import com.nagarro.empManagement.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDetailsDAO employeeDetailsDao;
	
	@Override
	public List<Employee> getAllEmpDetails(){
		return employeeDetailsDao.findAll();
		
	}
	
	@Override
	public Employee editEmpDetails(Employee emp) {
		if (emp.getEmpCode() == null || emp.getEmpName() == null || emp.getEmpName().strip().length() == 0)
			throw new EmptyInputException(Constant.HTTP_ERROR_CODE, Constant.ERROR_MSG_VALID_INPUT);
		
		return employeeDetailsDao.save(emp);
	}
	
	@Override
	public Employee addEmpDetails(Employee emp) {

		if (emp.getEmpCode() == null || emp.getEmpName() == null || emp.getEmpName().strip().length() == 0)
			throw new EmptyInputException(Constant.HTTP_ERROR_CODE, Constant.ERROR_MSG_VALID_INPUT);

		return employeeDetailsDao.save(emp);

	}

}
