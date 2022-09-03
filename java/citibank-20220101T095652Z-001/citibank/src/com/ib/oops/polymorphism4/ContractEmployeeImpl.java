package com.ib.oops.polymorphism4;

public class ContractEmployeeImpl extends EmployeeImplOverLoadingOverRiding{
	
	
	void saveEmployee(){
		System.out.println("employee saved");
	}
	
	void updateEmployee(){
		System.out.println("employee updated ");
	}
	
	
	// overridden method
	String getEmployeeSalary() {
		return "300000";
	}


}
