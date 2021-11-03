package com.lezurex.overcomplicated;

import static com.lezurex.overcomplicated.IsIntegerEven.isEven;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IsIntegerEvenTest {
    
    @Test
    public void testIsEven() {
        assertTrue(isEven(10));
    }

    @Test
    public void testIsOdd() {
        assertTrue(!isEven(11));
    }

}
