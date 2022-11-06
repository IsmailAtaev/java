package com.task.service;

import org.junit.Assert;
import org.junit.Test;

public class NumberTest {

    @Test
    public void setAndGetValueTestPositive() {
        Number number = new Number();
        number.setValueInt(55);
        Integer expected = 55;
        Integer actually = number.getValueInt();
        Assert.assertEquals(expected, actually);
    }


    @Test
    public void setAndGetValueTestNegative() {
        Number number = new Number();
        number.setValueInt(-55);
        Integer expected = -55;
        Integer actually = number.getValueInt();
        Assert.assertEquals(expected, actually);
    }




}