package com.lezurex.overcomplicated;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IsNotNumberOneTest {

    @Test
    public void isNumberOneIsWorking() {
        assertTrue(IsNotNumberOne.isNotNumberOne(2));
    }

    @Test
    public void isNumberOneIsAlsoWorking() {
        assertFalse(IsNotNumberOne.isNotNumberOne(1));
    }
}