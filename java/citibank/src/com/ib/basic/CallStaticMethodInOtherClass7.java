package com.ib.basic;

public class CallStaticMethodInOtherClass7 {
	
	static void loan() {
		System.out.println(" Calledd.. from loan");
		System.out.println(" loan mthod end end");
	}

	
	

	public static void main(String[] args) {

		// calling method by class name ,  only static method is possible to call by class name
		ProcessSalaryImpl.creditSalary();
		
		// not static method cannot be called by using class name
		//ProcessSalaryImpl.credit();
		
	}

}
