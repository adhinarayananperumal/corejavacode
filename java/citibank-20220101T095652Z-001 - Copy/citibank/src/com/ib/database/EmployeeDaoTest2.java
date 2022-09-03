package com.ib.database;

import java.util.List;

public class EmployeeDaoTest2 {

	EmployeePojo employeePojo = new EmployeePojo();
	EmployeeDao employeeDao = new EmployeeDaoImpl();

	void saveEmployee() throws Exception {
		employeePojo.setAge(34);
		employeePojo.setEmpId("kumar");
		employeePojo.setEmpName("raja");

		employeeDao.save(employeePojo);
		System.out.println("Employee aved successfully....");
	}

	void updateEmployee() throws Exception {

		// update employee
		employeePojo.setAge(50);
		employeePojo.setEmpId("101");
		employeePojo.setEmpName("Vijay Kumar");
		employeeDao.updateEmployee(employeePojo);
		System.out.println("Employee updated successfully........");

	}

	void getEmployee() throws Exception {

		employeePojo = employeeDao.getEmployee("33333");

		if (employeePojo != null) {
			System.out.println("\n Employee Name :" + employeePojo.getEmpName());
			System.out.println("\n Employee Id :" + employeePojo.getEmpId());
			System.out.println("\n Employee Age :" + employeePojo.getAge());
		} else {
			System.out.println("Employee not found");
		}

	}

	void listEmployee() throws Exception {

		List<EmployeePojo> empList = employeeDao.listEmployee();

		for (EmployeePojo e : empList) {
			System.out.println(e.getEmpName());
			System.out.println(e.getEmpId());
			System.out.println(e.getAge());

		}

	}

	void deleteEmployee() throws Exception {
		employeePojo.setEmpId("iq234");
		employeeDao.deleteEmployee(employeePojo);
		System.out.println("Employee deleted successfully........");

	}

	public static void main(String[] args) {
		EmployeeDaoTest2 employeeDaoTest = new EmployeeDaoTest2();

		try {

			// employeeDaoTest.saveEmployee();
			// employeeDaoTest.getEmployee();
			//employeeDaoTest.listEmployee();
			// employeeDaoTest.deleteEmployee();
			// employeeDaoTest.updateEmployee();
			
			System.out.println("End of program...");

		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Problem Happened , please try again after some time");
		}

	}

}
