package com.planit.simpleREST.db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.planit.simpleREST.loans.LoanEntry;

@Repository
public interface LoansRepository extends CrudRepository<LoanEntry, String> {
} 