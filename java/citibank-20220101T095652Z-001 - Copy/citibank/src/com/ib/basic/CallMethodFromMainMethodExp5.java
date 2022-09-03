package com.ib.basic;


public class CallMethodFromMainMethodExp5 {
	
	static void m2() {
		System.out.println(" m2 going to execute");
		System.out.println(" m2 ended end");
	}

	
	static void loan() {
		System.out.println(" Calledd.. from loan");
		m2();
		System.out.println(" loan mthod end end");
	}
	
	
	public static void main(String[] a) {
		
		System.out.println(" method going to call");

		loan();
		
		System.out.println(" method called returned");
	}
	
	

}
