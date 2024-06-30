package com.planit.simpleREST.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.planit.simpleREST.db.LoansDBService;
import com.planit.simpleREST.loans.InterestCalculator;

@RestController
public class LoanController {

    @Autowired private LoansDBService loansDBService;
    
    @GetMapping("/loan/{id}/interest")
    public RESTResponse<Double> getInterest(@PathVariable String id) {
        var loan = loansDBService.readLoan(id);
        var interestCalculator = new InterestCalculator();
        return new RESTResponse<Double>("success", interestCalculator.simpleInterest(loan));
    }
}
