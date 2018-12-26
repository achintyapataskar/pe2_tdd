package com.stackroute.unittest.pe2;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoRial {
    private   Factorial math;

    @Before
    public void init() { math = new Factorial(); }
    @After
    public void tearDown() { math = null; }

    @Test
    public void factorial() {
        assertEquals(1,math.factorial(0));
        assertEquals(1,math.factorial(1));
        assertEquals(120,math.factorial(5));
    }
}