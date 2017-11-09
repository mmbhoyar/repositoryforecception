package com.myrestexample.controller;

import com.myrestexample.beans.Employee;

public class MyTest 
{

	public static void main(String[] args) 
	{
		EmployeeController ec = new EmployeeController();
		
		Employee employeebean = new Employee();
		employeebean.setId(1);
		employeebean.setName("AAA");
		employeebean.setSalary(50000);
		
		ec.saveEmployee(employeebean);
	}
}
