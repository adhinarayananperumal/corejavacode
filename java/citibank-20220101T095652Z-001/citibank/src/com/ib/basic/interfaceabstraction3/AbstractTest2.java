package com.ib.basic.interfaceabstraction3;

public class AbstractTest2 {

	public static void main(String[] args) {

		LoanPojo loanPojo = new LoanPojo();
		
		Loan loan = new CustomerLoan();
		loan.saveLoan(loanPojo);
		
		

	}

}
