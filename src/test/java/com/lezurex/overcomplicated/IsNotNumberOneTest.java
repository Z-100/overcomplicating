package com.lezurex.overcomplicated;

import org.junit.Assert;
import org.junit.Test;

public class IsNotNumberOneTest {

    @Test
    public void isNumberOneIsWorking() {
        Assert.assertTrue(IsNotNumberOne.isNotNumberOne(2));
    }

    @Test
    public void isNumberOneIsAlsoWorking() {
        Assert.assertFalse(IsNotNumberOne.isNotNumberOne(1));
    }
}