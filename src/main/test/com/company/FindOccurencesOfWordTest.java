package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindOccurencesOfWordTest {

    FindOccurencesOfWord findOccurencesOfWord;

    @Before
    public void setUp() throws Exception {
        findOccurencesOfWord = new FindOccurencesOfWord();
    }

    @After
    public void tearDown() throws Exception {
        findOccurencesOfWord = null;
    }

    @Test
    public void findOccurencesOfWordSuccess() {
        String expectedValue = "found at 4 6 found at 10 12 found at 27 29 ";
        String actualValue = findOccurencesOfWord.findOccurences("se", "She sells seashells by the seashore");

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void findOccurencesOfWordFailure() {
        String expectedValue = "The substring is Not found in input String";
        String actualValue = findOccurencesOfWord.findOccurences("pppp", "She sells seashells by the seashore");

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void findOccurencesOfWordNullString() {
        String expectedValue = "Null input is not expected";
        String actualValue = findOccurencesOfWord.findOccurences(null, "She sells seashells by the seashore");

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void findOccurencesOfWordEmptyString() {
        String expectedValue = "finder Stirng should not be of zero size";
        String actualValue = findOccurencesOfWord.findOccurences("", "");

        Assert.assertEquals(expectedValue, actualValue);
    }

}