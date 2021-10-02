package com.lezurex;

import static org.junit.Assert.*;

import org.junit.Test;

public class BooleanCheckerTest {

    @Test
    public void testIsTrue() {
        assertTrue(BooleanChecker.isTrue(true));
        assertFalse(BooleanChecker.isTrue(false));
    }

    @Test
    public void testIsFalse() {
        assertTrue(BooleanChecker.isFalse(false));
        assertFalse(BooleanChecker.isFalse(true));
    }

}
