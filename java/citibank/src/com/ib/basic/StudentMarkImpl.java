package com.ib.basic;

public class StudentMarkImpl {

	void printMark(int totalmark) {
		System.out.println("Total mark is... " + totalmark);
	}

	int printMarkwbonus(int totalmark) {
		System.out.println("Total mark is... " + totalmark);

		int totalmarkwb = totalmark + 10;

		return totalmarkwb;
	}

}
