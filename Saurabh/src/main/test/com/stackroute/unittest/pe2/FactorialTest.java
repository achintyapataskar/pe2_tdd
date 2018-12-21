package com.stackroute.unittest.pe2;
import org.junit.Test;
import org.junit.Assert.*;

public class FactorialTest {


    @Test
    public void testFactorial() {

        FactorialTest test = new FactorialTest();

        System.out.println("factorial");
        int number = 5;
        int expResult = 120;
        int result = test.factorial(number);
        assertEquals(expResult, result);

    }

    /**
     * Test of factorial method, of class Test2 for number greater tahn 20.
     */
    @Test
    public void testFactorial2() {

        FactorialTest test2 = new FactorialTest();

        System.out.println("factorial");
        long number = 22;

        long expResult = 0L;
        long result = test2.factorial(number);
        assertEquals(expResult, result);


    }
}