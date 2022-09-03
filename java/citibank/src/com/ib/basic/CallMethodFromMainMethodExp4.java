package com.ib.basic;

public class CallMethodFromMainMethodExp4 {
	
	
	static void loan() {
		System.out.println(" Calledd.. from loan");
		System.out.println(" loan mthod end end");
	}
	
	
	public static void main(String[] a) {
		
		System.out.println(" method going to call");

		
		loan();
		
		System.out.println(" method called returned");
	}
	
	

}
