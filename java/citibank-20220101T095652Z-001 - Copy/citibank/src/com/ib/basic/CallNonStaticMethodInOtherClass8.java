package com.ib.basic;


public class CallNonStaticMethodInOtherClass8 {
	
	static void loan() {
		System.out.println(" Calledd.. from loan");
		System.out.println(" loan mthod end end");
	}

	
	

	public static void main(String[] args) {

		// calling method by class name ,  only static method is possible to call by class name
		ProcessSalaryImpl.creditSalary();
		
		// not static method cannot be called by using class name
		//ProcessSalaryImpl.credit();
		
		// create object and call non static method
		ProcessSalaryImpl obj1 = new ProcessSalaryImpl();
		obj1.credit();
		
		//works ,  but wrong
		obj1.creditSalary();

		
	}

}
