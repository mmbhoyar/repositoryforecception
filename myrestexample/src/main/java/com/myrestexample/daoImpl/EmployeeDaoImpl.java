package com.myrestexample.daoImpl;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myrestexample.dao.EmployeeDao;
import com.myrestexample.model.EmployeeEntity;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addEmployee(EmployeeEntity empEntity) {
		Session session = sessionFactory.getCurrentSession();
		org.hibernate.Transaction trans = session.beginTransaction();
		session.save(empEntity);
		System.out.println(empEntity+"in dao class");
		trans.commit();
	}

	public EmployeeEntity getEmployee(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		org.hibernate.Transaction trans = session.beginTransaction();
		EmployeeEntity e = (EmployeeEntity) session.get(EmployeeEntity.class, new Integer(id));
		trans.commit();
		return e;
	}

	public void getAllEmployee() {
		// TODO Auto-generated method stub

	}

	public void updateEmployee() {
		// TODO Auto-generated method stub

	}

	public void deleteEmployee(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		org.hibernate.Transaction trans = session.beginTransaction();
		EmployeeEntity e = (EmployeeEntity) session.get(EmployeeEntity.class, new Integer(id));
		session.delete(e);
		session.flush();
		
		trans.commit();
		session.close();
	}

}
