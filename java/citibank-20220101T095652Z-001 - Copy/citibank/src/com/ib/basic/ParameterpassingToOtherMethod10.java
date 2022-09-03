package com.ib.basic;

public class ParameterpassingToOtherMethod10 {

	public static void main(String[] args) {

		int eng = 178;
		int tam = 32;
		int mat = 89;
		int his = 78;
		int sci = 100;

		int total = eng + tam + mat + his + sci;

		System.out.println("Total  Mark is : " + total);

		StudentMarkImpl ob = new StudentMarkImpl();
		ob.printMark(total);
		
		System.out.println("Execution end...");


	}

}
