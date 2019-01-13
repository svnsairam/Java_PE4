package com.stackroute.javaPe4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString transposeString;

    @Before
    public void setUp() throws Exception {
        transposeString = new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        transposeString = null;
    }

    @Test
    public void transposeStringSuccess() {
        String expectedValue = "a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god";
        String actualValue = transposeString.transposeString("a quick brown fox jumps over the lazy dog");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void transposeStringFailure() {
        String expectedValue = "a  kciuq  nworb  xof  spmuj  revo  eht  yzal";
        String actualValue = transposeString.transposeString("a quick brown fox jumps over the lazy dog");
        Assert.assertNotEquals(expectedValue, actualValue);
    }

    @Test
    public void transposeStringNull() {
        String expectedValue = "Null Input not expected";
        String actualValue = transposeString.transposeString(null);
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertNotNull(actualValue);
    }
}