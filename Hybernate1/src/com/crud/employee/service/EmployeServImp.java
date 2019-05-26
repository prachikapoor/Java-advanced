package com.crud.employee.service;

import com.crud.employee.dao.EmployeeDaoImp;
import com.crud.model.Employee;

public class EmployeServImp implements IEmployee {
	EmployeeDaoImp empDao;
	
	
	public EmployeServImp() {
		empDao=new EmployeeDaoImp();
		
	}


	@Override
	public Employee addEmployee(Employee employee) {
		empDao.beginTx();
		Employee addedEmployee=empDao.addEmployee(employee);
		empDao.commitTx();
		return addedEmployee;
	}


	@Override
	public Employee updateEmployee(Employee employee) {
		empDao.beginTx();
		employee.setEmpName("pooja");
		Employee updatededEmployee=empDao.updateEmployee(employee);
		empDao.commitTx();
		return updatededEmployee;
		
	}


	@Override
	public Employee getEmployeeById(Integer empId) {
		// TODO Auto-generated method stub
		return empDao.getEmployeeById(empId);
	}


	@Override
	public Employee deleteEmployeeById(Integer empId) {
		empDao.beginTx();
		Employee deletededEmployee=empDao.deleteEmployeeById(empId);
		empDao.commitTx();
		return deletededEmployee;
		
		
	}


	
	

}
