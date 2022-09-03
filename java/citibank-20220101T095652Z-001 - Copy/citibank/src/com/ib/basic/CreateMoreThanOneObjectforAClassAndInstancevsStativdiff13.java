package com.ib.basic;

public class CreateMoreThanOneObjectforAClassAndInstancevsStativdiff13 {

	public static void main(String[] args) {

		StudentServiceImpl  studentServiceImplOne = new StudentServiceImpl();
		StudentServiceImpl  studentServiceImplTwo = new StudentServiceImpl();

		// first object
		
		System.out.println(studentServiceImplOne);
		System.out.println(studentServiceImplTwo);
		
		// first object
		// displays default value 
		studentServiceImplOne.displayDefaultValueOfAll();
		//city value in object
		studentServiceImplOne.displayCity();
		
		System.out.println("\n\n");

		
		
		// second object
		// displays default value 
		studentServiceImplTwo.displayDefaultValueOfAll();
		//city value in object
		studentServiceImplTwo.displayCity();
		
		
		//change instance variable value in second object
		studentServiceImplTwo.city="banglore";
		studentServiceImplOne.city="mumbai";

		System.out.println("\n\n");
		
		studentServiceImplOne.displayCity();
		studentServiceImplTwo.displayCity();
		
		System.out.println("\n\n");
		studentServiceImplTwo.displayCollegeName();
		studentServiceImplOne.displayCollegeName();

        //  static variable
		studentServiceImplTwo.collegename="Raj College";
		
		System.out.println("\n\n");
		studentServiceImplOne.displayCollegeName();
		studentServiceImplTwo.displayCollegeName();


		// instance variable - each instance will have its own value
		// static variable - all instance will share same variable value



	}

}
