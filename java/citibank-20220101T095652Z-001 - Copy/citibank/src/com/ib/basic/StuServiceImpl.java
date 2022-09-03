package com.ib.basic;

public class StuServiceImpl {
	
	
	
	
	void markAddBonus(int total){
		
		total = total + 10;
		
	}

	
	void markAddBonusValueByAddress(MarkPojo markPojo) {
		
		markPojo.total = markPojo.total + 10;
		
		
	}
	
	
	
}
