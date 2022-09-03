package com.ib.basic;

public class EmployeeServiceImpl {
	
	
	//global variable
	static String companyName = "GLSH";


	// instance variable are declared out side method
	String companyCity = "Chennai";

	void saveEmployee() {
		// local variable  inside the method
		int empid = 101;
		System.out.println(empid);
		System.out.println(companyName);

	}
	
	
	
	void save() {
		// you cannot access variable declared inside other method
		//System.out.println(empid);  // will produce error
		System.out.println(companyName);
	}

}
