package com.ib.threadexp1;
public class Test3join {
	
	public static void main(String[] args) {
		
		// 	Sleep
		System.out.println("Sleep thread demosntration......");
		
		Runnable rthread3 = new SleepExample3();
		Thread t3 = new Thread(rthread3);
		t3.start();
		
		Runnable rthread4 = new SleepExample4();
		Thread t4 = new Thread(rthread4);
		t4.start();
		
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


		System.out.println("Ending thread sleep demosntration......");
		System.out.println("Task completed  successfully......");

	}
}
