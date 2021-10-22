package com.lezurex.overcomplicated;

import org.junit.Assert;
import org.junit.Test;

public class IsNumberOneTest {

    @Test
    public void isNumberOneIsWorking() {
        Assert.assertTrue(IsNumberOne.isNumberOne(1));
    }

    @Test
    public void isNumberOneIsAlsoWorking() {
        Assert.assertFalse(IsNumberOne.isNumberOne(2));
    }
}