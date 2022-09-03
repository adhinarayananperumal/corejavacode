package com.ib.oops.inheritance.encapsulationexp2;

public class SimpleEcapsulationExpTest2 {
	public static void main(String[] args) {

		SimpleEcapsulationExp simpleEcapsulationExp = new SimpleEcapsulationExp();
		
		// Private method cannot be called through object reference variable
		// In same class some other method is eligible  call
		//simpleEcapsulationExp.m1();
		
		// protected method alloweded to call
		simpleEcapsulationExp.m2();
		
		// public method alloweded to call
		//simpleEcapsulationExp.m3();

	}

	

}
