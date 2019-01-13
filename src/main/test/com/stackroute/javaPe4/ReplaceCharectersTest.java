package com.stackroute.javaPe4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharectersTest {
    ReplaceCharecters replaceCharecters;

    @Before
    public void setUp() throws Exception {
        replaceCharecters = new ReplaceCharecters();
    }

    @After
    public void tearDown() throws Exception {
        replaceCharecters = null;
    }

    @Test
    public void replaceCharectersSuccess() {
        String expectedValue = "fffffttttt";
        String actualValue = replaceCharecters.replaceCharecters("dddddlllll");

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void replaceCharectersFailure() {
        String expectedValue = "aaaaaaffffttttt";
        String actualValue = replaceCharecters.replaceCharecters("aaaadddddlllll");

        Assert.assertNotEquals(expectedValue, actualValue);
    }
}