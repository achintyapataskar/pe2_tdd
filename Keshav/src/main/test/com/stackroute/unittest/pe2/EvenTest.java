package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenTest {
    @Test
    public void eventest1(){
        Even num= new Even();
        assertEquals(false,num.isEven(7));

    }
    @Test
    public void eventest2(){
        Even num1= new Even();
        assertEquals(true,num1.isEven(1000));

    }
    @Test
    public void eventest2(){
        Even num1= new Even();
        assertEquals(true,num1.isEven(000));

    }
    @Test
    public void eventest2(){
        Even num1= new Even();
        assertEquals(true,num1.isEven(-2));

    }






}
