package com.ib.basic;

public class ConstructorExample15 {
	
	// constructor are used to initialize instance variable during object creation

	public static void main(String[] args) {

		EmpImpl empImpl = new EmpImpl();
		System.out.println(empImpl.sid);


		System.out.println("\n");

		
		EmpImpl empImpl2 = new EmpImpl("karthi");

		System.out.println(empImpl2.sid);

	}

}
