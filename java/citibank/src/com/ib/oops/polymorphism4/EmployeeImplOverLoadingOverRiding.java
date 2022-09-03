package com.ib.oops.polymorphism4;

public class EmployeeImplOverLoadingOverRiding {
	
	//getEmployee is over loaded with different parameter
	
	// generateEmployeeId is protected encapsulation - it can be called from sub class and with in same package
	
	
	final protected void generateEmployeeId(){
		System.out.println("employee id generated");
	}

	void getEmployee(String empId) {
		System.out.println("getEmployee by id");
	}

	void getEmployee(String empId, String status) {
		System.out.println("getEmployee by id and status");
	}

	String getEmployeeSalary() {
		return "20000";
	}

}
