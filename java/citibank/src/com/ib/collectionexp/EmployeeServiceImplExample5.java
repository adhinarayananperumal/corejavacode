package com.ib.collectionexp;


import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImplExample5 {

	public static void main(String[] args) {
		
		// call a method which will return a collection and the print


		
		EmployeeDao employeeDao= new EmployeeDao();
		
		List<EmployeePojo> empLi = employeeDao.getEmployeeList();
		
		for (EmployeePojo eobj : empLi) {
			System.out.println("\n employee id : " + eobj.getEid()); 
			System.out.println("Employee name   : " + eobj.geteName());
		}
		
		
		System.out.println("\n\n Completed printing....\n\n");
		
		// pass collection and print

		
		EmployeePojo e1 = new EmployeePojo();
		e1.setEid(101);
		e1.seteName("kum");
		e1.setSalary(8000);

		EmployeePojo e2 = new EmployeePojo();
		e2.setEid(102);
		e2.seteName("ravi");
		e2.setSalary(50000);
		
		EmployeePojo e3 = new EmployeePojo();
		e3.setEid(104);
		e3.seteName("radha");
		e3.setSalary(40000);


		List<EmployeePojo> empList = new ArrayList();

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);

		
		boolean status = employeeDao.updateEmployees(empList);
		
		System.out.println(status);

	}

}
