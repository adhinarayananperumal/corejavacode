package com.ib.threadexp1;

public class SleepExample3 implements Runnable{
	
	
	public void run() {
		System.out.println("Thread 3 line1 thread class");
		System.out.println("Thread 3 SleepExample3 thread is running...");
		System.out.println("Thread 3 line3");	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread 3 line4");
		System.out.println("Thread 3 line5  end of run() method  - thread ended ");
	}


}
