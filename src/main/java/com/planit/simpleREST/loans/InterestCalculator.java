package com.planit.simpleREST.loans;

public class InterestCalculator {
    /**
     * TODO: This method is an example of non testable code.
     * How can this method be refactored to make it testable?
     * What impact will the refator have on the rest of the application?
     * 
     * @param loanId
     * @return simple interest calculation
     */
    public double simpleInterest(LoanEntry loan) {
        return loan.principal*loan.rate*loan.lengthYears/100;
    }
}
