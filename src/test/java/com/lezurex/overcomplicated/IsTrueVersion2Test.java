package com.lezurex.overcomplicated;

import junit.framework.TestCase;
import org.junit.Test;

public class IsTrueVersion2Test extends TestCase {

    @Test
    public void testIsTrueQuestionMark() {
        assertEquals("TRUE", IsTrueVersion2.isThisBooleanTrueQuestionMark(!false));
        assertEquals("FALSE", IsTrueVersion2.isThisBooleanTrueQuestionMark(!true));
    }
}