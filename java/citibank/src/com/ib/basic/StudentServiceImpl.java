package com.ib.basic;

public class StudentServiceImpl {
	
	
	
	static String collegename="Indira Gandhi College";
	String city;
	int cgrade;
	
	void displayCollegeName(){
		System.out.println("College name is  .. " + collegename);

	}

	
	//  understand default value
	void displayDefaultValueOfAll(){
		System.out.println("City name is  .. " + collegename);
		System.out.println("City name is  .. " + city);
		System.out.println("City name is  .. " + cgrade);
	}

	
	
	void displayCity(){
		System.out.println("City name is  .. " + city);
	}

}
