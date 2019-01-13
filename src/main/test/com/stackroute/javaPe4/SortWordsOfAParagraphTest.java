package com.stackroute.javaPe4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortWordsOfAParagraphTest {
    SortWordsOfAParagraph sortWordsOfAParagraph;

    @Before
    public void setUp() throws Exception {
        sortWordsOfAParagraph = new SortWordsOfAParagraph();
    }

    @After
    public void tearDown() throws Exception {
        sortWordsOfAParagraph = null;
    }

    @Test
    public void sortWordsTestSucess() {
        String expectedValue = "a this ";
        String actualValue = sortWordsOfAParagraph.sortWordsOfParagraph("this a");
        Assert.assertEquals(expectedValue, actualValue);
        expectedValue = "also be in is is my of order paragraph paragraph sorted sorted this this to words ";
        actualValue = sortWordsOfAParagraph.sortWordsOfParagraph("this is my paragraph of words to be sorted. this PARAGRAPH is also in sorted order .");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void sortWordsTestFailure() {
        String expectedValue = "this is a string ";
        String actualValue = sortWordsOfAParagraph.sortWordsOfParagraph("this is a string ");
        Assert.assertNotEquals(expectedValue, actualValue);
    }
}