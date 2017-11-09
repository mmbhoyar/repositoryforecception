package com.myrestexample.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myrestexample.dao.EmployeeDao;
import com.myrestexample.daoImpl.EmployeeDaoImpl;
import com.myrestexample.model.EmployeeEntity;
import com.myrestexample.service.EmployeeService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



@Service("employeeService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeDao empDao = new EmployeeDaoImpl();

	public void addEmployee(EmployeeEntity empEntity) 
	{
		empDao.addEmployee(empEntity);
	}

	public EmployeeEntity getEmployee(int id) 
	{
		return empDao.getEmployee(id);
	}

	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}

	

	public void updateEmployee() {
		// TODO Auto-generated method stub
		
	}

	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
