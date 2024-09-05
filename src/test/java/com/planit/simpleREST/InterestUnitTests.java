package com.planit.simpleREST;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.planit.simpleREST.loans.InterestCalculator;
import com.planit.simpleREST.loans.LoanEntry;

public class InterestUnitTests {

    /**
     * TODO: This test attempts to test a non-testable method.
     * Why is the test not a good unit test?
     * What makes the method non-testable?
     */
    @Test void checkSimpleInterest() {
        var loan = new LoanEntry("UNITID1", LocalDate.now(), 1000, 2, 2.6);
        var interest = new InterestCalculator().simpleInterest(loan);
        assertEquals(52, interest);
    }
}
