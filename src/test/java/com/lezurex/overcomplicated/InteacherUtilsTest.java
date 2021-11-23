package com.lezurex.overcomplicated;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class InteacherUtilsTest {

    @Test
    public void testInteacherUtils() {
        assertEquals(0b1000101, InteacherUtils.inteacher(0b1000101));
    }
}