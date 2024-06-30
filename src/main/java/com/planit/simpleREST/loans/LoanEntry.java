package com.planit.simpleREST.loans;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Loan")
public class LoanEntry {

    public LoanEntry() {
    }

    public LoanEntry(String id,
            LocalDate creationDate,
            double principal,
            int lengthYears,
            double rate) {
        this.id = id;
        this.creationDate = creationDate;
        this.principal = principal;
        this.lengthYears = lengthYears;
        this.rate = rate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    LocalDate creationDate;
    double principal;
    int lengthYears;
    double rate;
}
