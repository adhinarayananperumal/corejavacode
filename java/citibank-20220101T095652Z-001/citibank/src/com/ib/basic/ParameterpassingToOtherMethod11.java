package com.ib.basic;

public class ParameterpassingToOtherMethod11 {

	public static void main(String[] args) {

		int eng = 178;
		int tam = 32;
		int mat = 89;
		int his = 78;
		int sci = 100;

		int total = eng + tam + mat + his + sci;


		StudentMarkImpl ob = new StudentMarkImpl();
		int  totalwithbonus = ob.printMarkwbonus(total);
		
		System.out.println("total with bonus mark..." + totalwithbonus);


	}

}
