package com.stackroute.unittest.pe2;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberTest {

    EvenNumTest obj;

    @Before
    public void setUp() throws Exception {
        obj = new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
        EvenNumTest obj = null;
    }

    @Test
    public void boundaryvalue() {
        assertEquals(true,obj.isEven(0));
    }

    @Test
    public void lowerboundtrue() {
        assertEquals(true,obj.isEven(-96));
    }

    @Test
    public void lowerboundfalse() {
        assertEquals(false,obj.isEven(-1));
    }

    @Test
    public void upperboundtrue() {
        assertEquals(true,obj.isEven(24));
    }
    @Test
    public void upperboundfalse() {
        assertEquals(false,obj.isEven(85));
    }
}