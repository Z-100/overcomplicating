package com.lezurex.overcomplicated;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    
    @Test
    public void testIsString() {
        assertTrue(StringUtils.isString(new String(new byte[] { 0x68, 0x65, 0x6C, 0x6F })));
        assertFalse(StringUtils.isString(new Scanner(new BufferedReader(new InputStreamReader(System.in)))));
    }

}
