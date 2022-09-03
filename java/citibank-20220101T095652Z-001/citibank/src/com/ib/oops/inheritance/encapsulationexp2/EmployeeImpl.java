package com.ib.oops.inheritance.encapsulationexp2;

public  class EmployeeImpl {
	
	// public protected private

	protected void generateEmpId() {

		System.out.println("Employee id generated...");
	}
	
	
	private void testSuper() {
		System.out.println("test sub is called");
	}

	
	public void testSuperPublic() {
		System.out.println("test sub is called");
	}


}
