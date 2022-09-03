package com.ib.collectionexp;

public class ArrayExp {

	public static void main(String[] args) {

		try {
			String[] empNames = new String[5];
			empNames[0] = "TCS";
			empNames[1] = "A";
			empNames[2] = "BB";
			empNames[3] = "C";
			empNames[4] = "DDDDDDDDDDDDDDDDDDDDDDDDDDD";
			 empNames[5] = "DDDDDDDDDDDDDDDDDDDDDDDDDDD";

			for (int i = 0; i < empNames.length; i++) {
				System.out.println(empNames[i]);
			}
		} catch (Exception e) {
			System.out.println("Array problem.....");
		}

	}

}
