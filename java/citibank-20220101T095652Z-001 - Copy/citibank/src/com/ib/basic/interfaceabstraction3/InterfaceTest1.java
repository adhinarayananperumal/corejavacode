package com.ib.basic.interfaceabstraction3;

public class InterfaceTest1 {

	public static void main(String[] args) {

		LoanPojo loanPojo = new LoanPojo();
		
		Loan loan = new VehicleLoanImpl();
		loan.saveLoan(loanPojo);
		
		Loan gloan = new GoldLoanImpl();
		gloan.saveLoan(loanPojo);
		

	}

}
