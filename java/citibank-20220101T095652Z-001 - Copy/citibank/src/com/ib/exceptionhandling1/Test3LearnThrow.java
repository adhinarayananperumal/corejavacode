package com.ib.exceptionhandling1;

public class Test3LearnThrow {

	public static void main(String[] args) {
		try {
			SimpleExceptionHandlingLearnThrow3 simpleExceptionHandlingLearnThrow3 = new SimpleExceptionHandlingLearnThrow3();
			simpleExceptionHandlingLearnThrow3.call();
			System.out.println("Program returned successfully");
		} catch (Exception e) {
			System.out.println(" there is an exception in called method.. ");
			// e.printStackTrace();
		} finally {
			System.out.println("finally block in test3");
		}
	}

}
