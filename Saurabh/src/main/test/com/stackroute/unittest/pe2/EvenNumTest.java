package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {

    EvenNumTest obj;

    @Before
    public void setUp() throws Exception {
        EvenNumTest obj = new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
        EvenNumTest obj = null;
    }

    @Test
    public void isEven() {
        assertEquals(false, obj.isEven(0));
        assertEquals(false, obj.isEven(3));
        assertEquals(true, obj.isEven(4));

    }

}