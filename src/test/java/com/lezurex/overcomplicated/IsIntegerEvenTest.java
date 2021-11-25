package com.lezurex.overcomplicated;

import static com.lezurex.overcomplicated.IsIntegerEven.isEven;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IsIntegerEvenTest {

    private static final int LIMIT = 30;

    @Test
    public void testIsEven() {
        for (int i = 0; i <= LIMIT; i += 2) {
            assertTrue(isEven(i));
        }
    }

    @Test
    public void testIsOdd() {
        for (int i = 1; i <= LIMIT; i += 2) {
            assertFalse(isEven(i));
        }
    }

    @Test
    public void overLimit() {
        assertFalse(isEven(LIMIT + 1));
    }

}
