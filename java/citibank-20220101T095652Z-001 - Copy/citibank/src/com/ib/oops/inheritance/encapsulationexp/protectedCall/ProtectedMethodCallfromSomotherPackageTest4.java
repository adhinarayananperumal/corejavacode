package com.ib.oops.inheritance.encapsulationexp.protectedCall;

import com.ib.oops.inheritance.encapsulationexp2.CEmployee;
//import com.ib.oops.inheritance.encapsulationexp2.DefaultModifierClass;

public class ProtectedMethodCallfromSomotherPackageTest4 {

	public static void main(String[] args) {

		CEmployee cemployeeImpl = new CEmployee();
		// protected method cannot be called from other package
		//cemployeeImpl.generateEmpId();

		// not known to other  package - encapsulation
		//DefaultModifierClass DefaultModifierClass = new DefaultModifierClass();
	}

}
