package com.lezurex.overcomplicated;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NegativeIntegerTest {

    @Test
    public void testGetNegativeInteger() {
        assertEquals(-0b101, NegativeInteger.getNegativeInteger(0b101));
    }

}