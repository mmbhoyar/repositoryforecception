package com.myrestexample.dao;

import com.myrestexample.model.EmployeeEntity;

public interface EmployeeDao {
	void addEmployee(EmployeeEntity empEntity);

	EmployeeEntity getEmployee(int id);

	void getAllEmployee();

	void deleteEmployee(int id);

	void updateEmployee();

}
