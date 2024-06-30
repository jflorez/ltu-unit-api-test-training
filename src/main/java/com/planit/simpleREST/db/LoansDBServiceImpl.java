package com.planit.simpleREST.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planit.simpleREST.loans.LoanEntry;

@Service
public class LoansDBServiceImpl implements LoansDBService {

    @Autowired
    LoansRepository loansRepository;

    @Override
    public LoanEntry readLoan(String loanId) {
        return loansRepository.findById(loanId).orElseThrow();
    }

    @Override
    public LoanEntry saveLoan(LoanEntry loan) {
        return loansRepository.save(loan);
    }
        
}