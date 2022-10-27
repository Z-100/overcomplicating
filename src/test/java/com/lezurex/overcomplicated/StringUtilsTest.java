package com.lezurex.overcomplicated;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testIsString() {
        assertTrue(StringUtils.isString(new String(new byte[] { 0b1101000, 0b1100101, 0b1101100, 0b1101111 })));
        assertFalse(StringUtils.isString(new Scanner(new BufferedReader(new InputStreamReader(System.in)))));
        assertFalse(StringUtils.isString(new String()));
    }

    @Test
    public void testIsNotString() {
        assertFalse(StringUtils.isNotString(new String(new byte[] { 0b1101000, 0b1100101, 0b1101100, 0b1101111 })));
        assertTrue(StringUtils.isNotString(new Scanner(new BufferedReader(new InputStreamReader(System.in)))));
        assertTrue(StringUtils.isNotString(new String()));
    }

    @Test
    public void isExactlyTwentyOneCharactersLong() {
        assertTrue(StringUtils.isExactlyTwentyOneCharactersLong(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011, 0b01101111, 0b01101111, 0b01101100 })));
        assertFalse(StringUtils.isExactlyTwentyOneCharactersLong(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01100101, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011, 0b01101111, 0b01101111, 0b01101100 })));
        assertFalse(StringUtils.isExactlyTwentyOneCharactersLong(new Integer(0b01010100)));
    }

    @Test
    public void isNotExactlyTwentyOneCharactersLong() {
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01111000 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01111000, 0b01110100 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01111000, 0b01110100, 0b00100000 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01111000, 0b01110100, 0b00100000, 0b01101001 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010, 0b01111001 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011, 0b01101111 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011, 0b01101111, 0b01101111 })));
        assertTrue(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011, 0b01101111, 0b01101111, 0b01101100 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01100101, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011, 0b01101111, 0b01101111, 0b01101100 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01100101, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011, 0b01101111, 0b01101111, 0b01101100, 0b01110110 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01100101, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011, 0b01101111, 0b01101111, 0b01101100, 0b01110110, 0b01100101 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01100101, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011, 0b01101111, 0b01101111, 0b01101100, 0b01110110, 0b01100101, 0b01110010 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01100101, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011, 0b01101111, 0b01101111, 0b01101100, 0b01110110, 0b01100101, 0b01110010, 0b01111001 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01100101, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011, 0b01101111, 0b01101111, 0b01101100, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01100101, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011, 0b01101111, 0b01101111, 0b01101100, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01100101, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011, 0b01101111, 0b01101111, 0b01101100, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011, 0b01101111 })));
        assertFalse(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01100101, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011, 0b01101111, 0b01101111, 0b01101100, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011, 0b01101111, 0b01101111 })));
        assertThrows(IllegalStateException.class, () -> StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new String(new byte[] { 0b01010100, 0b01101000, 0b01101001, 0b01110011, 0b00100000, 0b01110100, 0b01100101, 0b01111000, 0b01110100, 0b00100000, 0b01101001, 0b01110011, 0b00100000, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011, 0b01101111, 0b01101111, 0b01101100, 0b01110110, 0b01100101, 0b01110010, 0b01111001, 0b00100000, 0b01100011, 0b01101111, 0b01101111, 0b01101100 })));
        assertTrue(!StringUtils.isNotExactlyTwentyOneCharactersLongInALengthRangeOfZeroToThirty(new Integer(0b01010100)));
    }

    @Test
    public void isAHelloWorldString() {
        assertFalse(StringUtils.isAHelloWorldString(new String(new byte[] { 0b00100000, 0b01010111, 0b01101111, 0b01110010, 0b01101100, 0b01100100, 0b00100001 })));
        assertTrue(StringUtils.isAHelloWorldString(new String(new byte[] { 0b01001000, 0b01100101, 0b01101100, 0b01101100, 0b01101111, 0b00100000, 0b01010111, 0b01101111, 0b01110010, 0b01101100, 0b01100100, 0b00100001 })));
    }

    @Test
    public void dontParseTest() {
        assertNothing();
    }

    @Test
    public void getRandomStringTest() {
        assertEquals("random string", StringUtils.getRandomString());
    }

    private void assertNothing(Object... objects) {
        assertTrue(!false);
    }
}
