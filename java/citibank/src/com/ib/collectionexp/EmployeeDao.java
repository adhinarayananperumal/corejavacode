package com.ib.collectionexp;


import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

	boolean updateEmployees(List<EmployeePojo> empList) {

		System.out.println("inside updateEmployees");
		System.out.println(empList.size());
		
		
		for (EmployeePojo eobj : empList) {
			System.out.println(eobj.getEid());
			System.out.println(eobj.geteName());
		}

		return true;
	}

	public List<EmployeePojo> getEmployeeList() {
		// connect database
		EmployeePojo e1 = new EmployeePojo();
		e1.setEid(101);
		e1.seteName("kum");
		e1.setSalary(8000);

		EmployeePojo e2 = new EmployeePojo();
		e2.setEid(102);
		e2.seteName("ravi");
		e2.setSalary(50000);

		List<EmployeePojo> empList = new ArrayList();

		empList.add(e1);
		empList.add(e2);

		return empList;
	}

	/*
	 * public static void main(String... arg) {
	 * 
	 * EmployeePojo e1 = new EmployeePojo(); e1.setEid(101); e1.seteName("kum");
	 * e1.setSalary(8000);
	 * 
	 * EmployeePojo e2 = new EmployeePojo(); e2.setEid(102); e2.seteName("ravi");
	 * e2.setSalary(50000);
	 * 
	 * List<EmployeePojo> empList = new ArrayList();
	 * 
	 * empList.add(e1); empList.add(e2);
	 * 
	 * int empSize = empList.size();
	 * 
	 * System.out.println(empSize);
	 * 
	 * for (EmployeePojo eobj : empList) { System.out.println(eobj.getEid());
	 * System.out.println(eobj.geteName()); }
	 * 
	 * }
	 */
}
