package com.crud.employee.main;

import com.crud.employee.service.EmployeServImp;
import com.crud.employee.service.IEmployee;
import com.crud.model.Employee;

public class MainEmployee {
	private static IEmployee employService;

	static {
		employService=new  EmployeServImp();
			
	}
		public static void main(String[] args) {
			Employee employee=new Employee(11,"prachi");
			//employService.addEmployee(employee);
			System.out.println("added data is "+employService.addEmployee(employee));
			
			Employee emp=employService.updateEmployee(employee);
			System.out.println("update data is"+emp);
			
			Employee emp1=employService.getEmployeeById(5);
			System.out.println("found data is"+emp1);
			
			
			Employee emp2=employService.deleteEmployeeById(5);
			System.out.println("deleted data is"+emp2);
			
		}	
		
		
		
	}
	
	
	

 