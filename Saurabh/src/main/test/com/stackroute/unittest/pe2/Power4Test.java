package com.stackroute.unittest.pe2;
 import org.junit.Test;

 import org.junit.Assert;


public class Power4Test {

    @Test
    public void testForPower()

    {
            String expectedValue = "Yes";
            Power4 data=new Power4();
            String actualValue=data.isPower("4");
            assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testForPower()

    {
        String expectedValue = "No";
        Power4 data=new Power4();
        String actualValue=data.isPower("8");
        assertEquals(expectedValue, actualValue);

    }

//    @Test
//    public void testForZerothPower() {
//        String expectedValue = "Y";
//        PowerOfFour data=new PowerOfFour();
//        String actualValue=data.isPower("1");
//        assertEquals(expectedValue, actualValue);}


}