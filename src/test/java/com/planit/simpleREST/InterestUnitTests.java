package com.planit.simpleREST;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.planit.simpleREST.loans.InterestCalculator;

public class InterestUnitTests {

    /**
     * TODO: This test attempts to test a non-testable method.
     * Why is the test not a good unit test?
     * What makes the method non-testable?
     */
    @Test void checkSimpleInterest() {
        var interest = new InterestCalculator().simpleInterest("1");
        assertEquals(52, interest);
    }
}
