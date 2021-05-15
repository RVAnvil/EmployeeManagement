package com.nagarro.empManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.empManagement.entity.Employee;
@Repository
public interface EmployeeDetailsDAO extends JpaRepository<Employee, String>{

	
}
