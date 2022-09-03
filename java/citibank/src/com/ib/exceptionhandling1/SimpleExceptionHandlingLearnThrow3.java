package com.ib.exceptionhandling1;

public class SimpleExceptionHandlingLearnThrow3 {

	void call() {
		try {
			System.out.println("line 1");
			System.out.println("line 2");
			String name = "tcsyyyyrXuZyyyyyyyyyyyyyyyyyyyyyyy";
			System.out.println("line 4");
			char val = name.charAt(20);
			System.out.println("line 6  " + val + "");
			System.out.println("execution ended successfully");
		} catch (Exception e) {
			System.out.println("Problem inform to production support team or send mail any logic ");
			throw e;
		} finally {
			System.out.println("finally block");
		}
	}
}
