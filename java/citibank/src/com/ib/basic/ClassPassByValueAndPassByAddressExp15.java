package com.ib.basic;

public class ClassPassByValueAndPassByAddressExp15 {

	public static void main(String[] args) {

		StuServiceImpl stuServiceImpl = new StuServiceImpl();
		
		// all primitives  types are pass by value and string also
		int tot =400;
		stuServiceImpl.markAddBonus(tot);
		System.out.println("\nTotal with bonus   : " + tot);
		
		
		
		// pass by address
		MarkPojo markPojo = new MarkPojo();
		markPojo.total=400;
		
		stuServiceImpl.markAddBonusValueByAddress(markPojo);
		System.out.println("\nTotal with bonus  : " + markPojo.total);

		
	}

}
