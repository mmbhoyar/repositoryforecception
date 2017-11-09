package com.myrestexample.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.myrestexample.beans.Employee;
import com.myrestexample.model.EmployeeEntity;
import com.myrestexample.service.EmployeeService;
import com.myrestexample.serviceImpl.EmployeeServiceImpl;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService = new EmployeeServiceImpl();

	@POST
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void saveEmployee(@RequestBody Employee employeebean) {
		Employee empbean=employeebean;
		System.out.println("Bean:"+empbean)
		EmployeeEntity empEntity = prepareModel(empbean);
		employeeService.addEmployee(empEntity);
		System.out.println("__________________________");
	}
	
	
	private EmployeeEntity prepareModel(@RequestBody Employee employeebean) {
		EmployeeEntity emp = new EmployeeEntity();
		emp.setId(employeebean.getId());
		emp.setName(employeebean.getName());
		emp.setSalary(employeebean.getSalary());

		// System.out.println(emp);

		return emp;
	}

	//@GET
	@RequestMapping(value = "/getEmployee/{id}", method = RequestMethod.GET)
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public EmployeeEntity getEmployee(@PathVariable("id")Integer id) {
		EmployeeEntity emp = (EmployeeEntity) employeeService.getEmployee(id);
		return emp;

	}
	
	@PUT
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.PUT)
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteEmployee(@PathVariable("id") int empId) {
		employeeService.deleteEmployee(empId);
	}

}
