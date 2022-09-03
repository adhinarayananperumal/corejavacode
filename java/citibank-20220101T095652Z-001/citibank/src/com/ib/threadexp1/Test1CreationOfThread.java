package com.ib.threadexp1;

public class Test1CreationOfThread {

	public static void main(String[] args) {
		
		// CREATING THREAD
		// 	Asynchronous
		// thread scheduler
		
		System.out.println("Starting thread demosntration......");
		
		CreateThreadByThreadClass1 t1 = new CreateThreadByThreadClass1();
		//t1.run();
		t1.start();
		
		Runnable rthread = new CreateThreadByRunableInterface2();
		Thread t2 = new Thread(rthread);
		t2.start();
		
		System.out.println("Ending thread demosntration......");
		System.out.println("Task completed  successfully......");


	}

}
