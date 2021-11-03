package com.lezurex.overcomplicated;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
