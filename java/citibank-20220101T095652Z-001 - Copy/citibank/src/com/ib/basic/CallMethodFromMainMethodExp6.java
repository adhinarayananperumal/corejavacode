package com.ib.basic;



public class CallMethodFromMainMethodExp6 {
	
	static void m3() {
		System.out.println(" m3 going to execute");
		System.out.println(" m3 ended end");
		loan();
	}
	
	static void m2() {
		System.out.println(" m2 going to execute");
		System.out.println(" m2 ended end");
		m3();
	}

	
	static void m4() {
		System.out.println(" m4 going to execute");
		System.out.println(" m4 ended end");
	}


	
	static  void loan() {
		System.out.println(" Calledd.. from loan");
		m2();
		m4();
		m2();
		System.out.println(" loan mthod end end");
	}
	
	
	public static void main(String[] a) {
		
		System.out.println(" method going to call");
		loan();
		m3();
		System.out.println(" method called returned");
	}
	
	
}
