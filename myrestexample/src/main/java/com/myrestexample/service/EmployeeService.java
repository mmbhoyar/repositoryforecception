package com.myrestexample.service;

import com.myrestexample.beans.Employee;
import com.myrestexample.model.EmployeeEntity;

public interface EmployeeService 
{
	void addEmployee(EmployeeEntity empEntity);
	EmployeeEntity getEmployee(int id);
	void getAllEmployee();
	void deleteEmployee(int id);
	void updateEmployee();
	

}
