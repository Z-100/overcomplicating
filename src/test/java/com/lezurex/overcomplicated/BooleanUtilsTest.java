package com.lezurex.overcomplicated;

import static org.junit.Assert.*;

import com.lezurex.overcomplicated.BooleanUtils;

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
    public void testInvert() {
        assertTrue(BooleanUtils.invert(false));
        assertFalse(BooleanUtils.invert(true));
    }

}
