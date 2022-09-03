package com.ib.oops.inheritance.encapsulationexp2;

public class SimpleEcapsulationExp {

	private void m1() {
		System.out.println("Private method called");
	}

	protected void m2() {
		m1();
		System.out.println("protected method called");

	}

	public void m3() {
		System.out.println("public method called");
		m1();
	}

}
