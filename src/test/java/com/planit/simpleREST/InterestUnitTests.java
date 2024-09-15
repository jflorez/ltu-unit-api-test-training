package com.planit.simpleREST;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.planit.simpleREST.loans.InterestCalculator;
import com.planit.simpleREST.loans.LoanEntry;

public class InterestUnitTests {

    @Test void checkSimpleInterest() {
        var loan = new LoanEntry("UNITID1", LocalDate.now(), 1000, 2, 2.6);
        var interest = new InterestCalculator().simpleInterest(loan);
        assertEquals(52, interest);
    }
}
