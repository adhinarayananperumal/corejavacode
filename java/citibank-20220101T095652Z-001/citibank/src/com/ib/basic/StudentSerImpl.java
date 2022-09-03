package com.ib.basic;

public class StudentSerImpl {

	int calculateTotal(int eng, int tamil, int maths, int sci, int his,int cs) {

		int total = eng + tamil + maths + sci + his;

		return total;
	}
	
	

	int calculateTotal(MarkPojo markPojoobj) {

		int total = markPojoobj.getEng() + markPojoobj.getTam() + markPojoobj.mat + markPojoobj.sic + markPojoobj.his;

		return total;
	}

}
