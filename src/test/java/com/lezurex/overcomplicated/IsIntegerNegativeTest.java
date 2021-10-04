package com.lezurex.overcomplicated;

import junit.framework.TestCase;
import org.junit.Test;

public class IsIntegerNegativeTest extends TestCase {

    @Test
    public void testIsNegative() {
        assertTrue(String.valueOf(true), IsIntegerNegative.
                isNegative(-5));
    }
}