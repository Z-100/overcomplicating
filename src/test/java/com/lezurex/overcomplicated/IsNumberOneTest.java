package com.lezurex.overcomplicated;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IsNumberOneTest {

    @Test
    public void isNumberOneIsWorking() {
        assertTrue(IsNumberOne.isNumberOne(0b1));
    }

    @Test
    public void isNumberOneIsAlsoWorking() {
        assertFalse(IsNumberOne.isNumberOne(0b10));
    }
}