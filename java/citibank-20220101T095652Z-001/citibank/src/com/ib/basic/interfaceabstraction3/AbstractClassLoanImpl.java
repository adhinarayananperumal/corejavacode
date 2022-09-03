package com.ib.basic.interfaceabstraction3;

 abstract class AbstractClassLoanImpl implements Loan{

	// an abstract class can be with or without abstract method
	 
	 // use of abstract class is you can implement partial implementation of interface
	 // abstract method - force a protected method to be implemented in sub class
	
	@Override
	public void deleteLoan(String loanId) {
		// TODO Auto-generated method stub
	}
	
	protected abstract String processLoan();

	
}
