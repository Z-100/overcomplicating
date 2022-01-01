package com.lezurex.overcomplicated;

import static com.lezurex.overcomplicated.NumberLength.getNumberLength;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberLengthTest {

    @Test
    public void numberLengthTest() {
        assertEquals(1, getNumberLength(1));
        assertEquals(2, getNumberLength(22));
        assertEquals(3, getNumberLength(333));
        assertEquals(4, getNumberLength(4444));
        assertEquals(5, getNumberLength(55555));
        assertEquals(6, getNumberLength(666666));
        assertEquals(7, getNumberLength(7777777));
        assertEquals(8, getNumberLength(88888888));
        assertEquals(9, getNumberLength(999999999));
        assertEquals(10, getNumberLength(1111111111));
    }

}
