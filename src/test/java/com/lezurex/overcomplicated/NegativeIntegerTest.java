package com.lezurex.overcomplicated;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NegativeIntegerTest {

    @Test
    public void testGetNegativeInteger() {
        assertEquals(-5, NegativeInteger.getNegativeInteger(5));
    }

}