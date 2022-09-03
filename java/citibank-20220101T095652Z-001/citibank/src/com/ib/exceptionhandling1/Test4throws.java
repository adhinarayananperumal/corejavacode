package com.ib.exceptionhandling1;

public class Test4throws {
	
	public static void main(String[] args) {
		try {
			SimpleExceptionHandlingLearnThrows4 simpleExceptionHandlingLearnThrows4 = new SimpleExceptionHandlingLearnThrows4();
			simpleExceptionHandlingLearnThrows4.call();
			System.out.println("Program returned successfully");
		} catch (Exception e) {
			System.out.println(" there is an exception in called method.. ");
			// e.printStackTrace();
		} finally {
			System.out.println("finally block in test3");
		}
	}



}
