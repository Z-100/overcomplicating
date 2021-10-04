package com.lezurex.overcomplicated;

import junit.framework.TestCase;
import org.junit.Test;

public class NegativeIntegerTest extends TestCase {

    @Test
    public void testGetNegativeInteger() {
        assertEquals(-5, NegativeInteger.getNegativeInteger(5));
    }

}