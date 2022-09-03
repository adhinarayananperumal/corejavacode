package com.ib.exceptionhandling1;

public class SimpleExceptionHandlingLearnThrows4{

	void call()  throws Exception{
		try {
			System.out.println("line 1");
			System.out.println("line 2");
			String name = "GLSH";
			System.out.println("line 4");
			char val='s';
			if (name.length() > 10) {
				val = name.charAt(7);
			} else {
				throw new Exception();
			}

			System.out.println("line 6  " + val + "");
			System.out.println("execution ended successfully");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Problem inform to production support team or send mail any logic ");
			throw e;
		} finally {
			System.out.println("finally block");
		}
	}
}
