package com.stackroute.unittest.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenTest {
    EvenNumCheck obj;
    @Before
    public void setUp() throws Exception {
        obj=new EvenNumCheck();
    }

    @Test
    public void EvenNumCorrect() {
        boolean result=obj.isEven(4);
        assertTrue(result);
    }
    @Test
    public void EvenNumInCorrect() {
        boolean result=obj.isEven(7);
        assertFalse(result);
    }

}
