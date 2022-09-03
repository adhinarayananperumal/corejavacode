package com.ib.basic;

public class EmpImpl {
	
	
	// this key word  always referes to object
	
	String sid;

	EmpImpl() {
		System.out.println("Constructor initialized.....");
	}
	
	EmpImpl(String sid) {
		this.sid=sid;
		System.out.println("Constructor initialized.....");
	}
	
	EmpImpl(String sidd , String stuName) {
		System.out.println("Constructor initialized.....");
	}



	// instance variable
	int collegeUniRank;

	// static variable
	static String collegeName = "SSS";

	// method
	void getCollegeDet() {

		int stuid;
		stuid = 90;

		System.out.println(stuid);

		System.out.println(collegeUniRank);

	}

}
