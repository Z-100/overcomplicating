package com.lezurex.overcomplicated;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IsTrueVersion2Test {

    @Test
    public void testIsTrueQuestionMark() {
        assertEquals("TRUE", IsTrueVersion2.isThisBooleanTrueQuestionMark(!false));
        assertEquals("FALSE", IsTrueVersion2.isThisBooleanTrueQuestionMark(!true));
    }
}