package com.lezurex.overcomplicated;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConvertToIntTest {

    @Test
    public void testToInt() {
        assertEquals(420, ConvertToInt.toInt(420));
    }
}
