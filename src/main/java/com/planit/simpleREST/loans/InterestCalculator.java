package com.planit.simpleREST.loans;

import com.planit.simpleREST.db.Database;
import com.planit.simpleREST.db.FakeDatabase;

public class InterestCalculator {
    /**
     * TODO: This method is an example of non testable code.
     * How can this method be refactored to make it testable?
     * What impact will the refator have on the rest of the application?
     * 
     * @param loanId
     * @return simple interest calculation
     */
    public double simpleInterest(String loadId) {
        Database db = new FakeDatabase();
        var loan = db.findEntry("id", loadId);
        return (double) loan.get("principal") * (double) loan.get("rate") * (int) loan.get("lengthYears") / 100;
    }
}
