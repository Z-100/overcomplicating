package com.lezurex.overcomplicated;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IsIntegerNegativeTest {

    @Test
    public void testIsNegative() {
        assertTrue(IsIntegerNegative.
                isNegative(-0b101));
    }
}