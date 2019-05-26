package com.crud.employee.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.crud.model.Employee;

public class EmployeeDaoImp implements IEmployeeDao {
SessionFactory factory;
Session session;
Transaction transaction;



	public EmployeeDaoImp() {
 factory=new Configuration().configure().buildSessionFactory();
 session=factory.openSession();
 
}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("from dao"+employee);
		 session.save(employee);
		return employee;
	}

	@Override
	public Transaction beginTx() {
		transaction=session.beginTransaction();
		return transaction;
	
	}

	@Override
	public void commitTx() {
		// TODO Auto-generated method stub
		transaction.commit();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("from dao"+employee);
		 session.update(employee);
		return employee;
	}

	@Override
	public Employee getEmployeeById(Integer empId) {
		// TODO Auto-generated method stub
		return (Employee)session.get(Employee.class,empId);
	}

	@Override
	public Employee deleteEmployeeById(Integer empId) {
		// TODO Auto-generated method stub
		Employee e=getEmployeeById(empId);
		if(e!=null) {
			session.delete(e);
		}
		else {
			e=null;
		}
		return e;
	}

	
	
		 
	}

