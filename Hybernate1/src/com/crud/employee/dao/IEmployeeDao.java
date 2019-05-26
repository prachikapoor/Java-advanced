package com.crud.employee.dao;


import org.hibernate.Transaction;

import com.crud.model.Employee;

public interface IEmployeeDao {
public Employee addEmployee(Employee employee);
public Transaction beginTx();
public void commitTx();
public Employee updateEmployee(Employee employee);
public Employee getEmployeeById(Integer empId);

public Employee deleteEmployeeById(Integer empId);
}
