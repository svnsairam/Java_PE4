package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindHarryTest {

    FindHarry findHarry;

    @Before
    public void setUp() throws Exception {
        findHarry = new FindHarry();
    }

    @After
    public void tearDown() throws Exception {
        findHarry = null;
    }

    @Test
    public void findHarrySuccess() {
        String expectedValue = "Is Harry here ? true";
        String actualValue = findHarry.findHarryInGivenString("This is Harry i am harry he is harry");

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void findHarryFailure() {
        String expectedValue = "Is Harry here ? false";
        String actualValue = findHarry.findHarryInGivenString("This is henry");

        Assert.assertEquals(expectedValue, actualValue);
    }
}