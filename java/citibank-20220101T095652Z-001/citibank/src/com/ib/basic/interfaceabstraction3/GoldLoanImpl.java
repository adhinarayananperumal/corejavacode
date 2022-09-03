package com.ib.basic.interfaceabstraction3;

public class GoldLoanImpl implements Loan {

	@Override
	public void saveLoan(LoanPojo loanPojo) {
		System.out.println("saveLoan method called.... ");
	}

	@Override
	public void deleteLoan(String loanId) {
		System.out.println("deleteLoan method called.... ");
	}

	@Override
	public void updateloan(LoanPojo loanPojo) {
		System.out.println("updateloan method called.... ");
	}

}
