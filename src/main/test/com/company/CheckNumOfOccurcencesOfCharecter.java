package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckNumOfOccurcencesOfCharecter {

    NumOfOccurcencesOfCharecter numOfOccurcencesOfCharecter;
    @Before
    public void setUp() throws Exception {
        numOfOccurcencesOfCharecter =   new NumOfOccurcencesOfCharecter();
    }

    @After
    public void tearDown() throws Exception {
        numOfOccurcencesOfCharecter =   null;
    }

    @Test
    public void findOccurenceOfCharecterSuccess() {
        int expectedValue   =   2;
        int actualValue     =   numOfOccurcencesOfCharecter.findOccurenceOfCharecter("a","find number of a's in a string");
        Assert.assertEquals(expectedValue,actualValue);

        expectedValue   =   0;
        actualValue     =   numOfOccurcencesOfCharecter.findOccurenceOfCharecter("z","find number of in a string");
        Assert.assertEquals(expectedValue,actualValue);

    }

    @Test
    public void findOccurenceOfCharecterFailure() {
        int expectedValue   =   3;
        int actualValue     =   numOfOccurcencesOfCharecter.findOccurenceOfCharecter("a","find number of a's in a string");
        Assert.assertNotEquals(expectedValue,actualValue);
    }

    @Test
    public void findForNull() {
        int expectedValue   =   -1;
        int actualValue     =   numOfOccurcencesOfCharecter.findOccurenceOfCharecter(null,"find number of a's in a string");

        Assert.assertEquals(expectedValue,actualValue);
        Assert.assertNotNull(actualValue);
    }

    @Test
    public void findWithEmptyString() {
        int expectedValue   =   0;
        int actualValue     =   numOfOccurcencesOfCharecter.findOccurenceOfCharecter("z","");
        Assert.assertEquals(expectedValue,actualValue);
    }

}