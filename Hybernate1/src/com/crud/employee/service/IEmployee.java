package com.crud.employee.service;

import com.crud.model.Employee;

public interface IEmployee {

	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee getEmployeeById(Integer empId);

	public Employee deleteEmployeeById(Integer empId);
	}

