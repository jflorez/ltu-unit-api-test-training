package com.planit.simpleREST.db;


import com.planit.simpleREST.loans.LoanEntry;

public interface LoansDBService {
    LoanEntry readLoan(String loanId);
    LoanEntry saveLoan(LoanEntry loan);
}

