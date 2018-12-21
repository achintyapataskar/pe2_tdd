package com.stackroute.unittest.pe1;

import org.junit.Before;
import org.junit.Test;

public class PowerOfFourTest {

    PowerOfFour obj;
    @Before
    public void setUp() throws Exception {
        obj=new PowerOfFour();
    }

    @Test
    public void PowerOfFourCorrect(){
        String result=obj.PowerOfFour(64);
        String expected="Number is power of 4";
        assertEquals(expected,result);
    }

    @Test
    public void PowerOfFourInCorrect(){
        String result=obj.PowerOfFour(54);
        String expected="Number is power of 4";
        assertEquals(expected,result);
    }

    @Test
    public void PowerOfFourCorrectNotPowOffour(){
        String result=obj.PowerOfFour(54);
        String expected="Number is not power of 4";
        assertEquals(expected,result);
    }
    @Test
    public void PowerOfFourInCorrectNotPowOffour(){
        String result=obj.PowerOfFour(16);
        String expected="Number is not power of 4";
        assertEquals(expected,result);
    }




}
