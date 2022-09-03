package com.ib.basic.interfaceabstraction3;

public interface Loan {

	// by default all variable is final static and public
	// by default all method is public

	String loanKey = "Loan";

	void saveLoan(LoanPojo loanPojo);

	void deleteLoan(String loanId);

	void updateloan(LoanPojo loanPojo);

}
