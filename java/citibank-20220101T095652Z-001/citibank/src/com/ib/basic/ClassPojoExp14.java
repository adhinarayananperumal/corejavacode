package com.ib.basic;

public class ClassPojoExp14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentSerImpl studentSerImpl = new StudentSerImpl();
		
		int total = studentSerImpl.calculateTotal(100, 67, 72, 89, 92,76);
		System.out.println(total);

		
		
		MarkPojo markPojo = new MarkPojo();
		markPojo.setEng(67);
		markPojo.setTam(72);
		markPojo.setMat(78);
		markPojo.setSic(91);
		markPojo.setHis(65);
		markPojo.setCs(76);
		
		total = studentSerImpl.calculateTotal(markPojo);
		
		System.out.println(total);

	}

}
