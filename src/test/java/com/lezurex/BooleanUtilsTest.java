package com.lezurex;

import static org.junit.Assert.*;

import org.junit.Test;

public class BooleanUtilsTest {

    @Test
    public void testIsTrue() {
        assertTrue(BooleanUtils.isTrue(true));
        assertFalse(BooleanUtils.isTrue(false));
    }

    @Test
    public void testIsFalse() {
        assertTrue(BooleanUtils.isFalse(false));
        assertFalse(BooleanUtils.isFalse(true));
    }

    @Test
    public void testInverse() {
        assertTrue(BooleanUtils.inverse(false));
        assertFalse(BooleanUtils.inverse(true));
    }

}
