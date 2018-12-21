package com.stackroute.unittest.pe2;
import org.junit.Test;

import static org.junit.Assert.*;
public class UpperCaseTest {

    @Test

    public void InUpperCase() {
        UpperCase data = new UpperCase();
        String actualValue = data.UpperCasewithLenght();
        assertEquals("Sucess", actualValue);
    }

    @Test

    public void NotUpperCase() {
        UpperCase data = new UpperCase();
        String actualValue = data.UpperCasewithLenght();
        assertEquals("failed", actualValue);
    }
    @Test

    public void NotAnAlphabet() {
        UpperCase data = new UpperCase();
        String actualValue = data.UpperCasewithLenght();
        assertEquals("Not an alphabet", actualValue);
    }
    public void Digit() {
        UpperCase data = new UpperCase();
        String actualValue = data.UpperCasewithLenght();
        assertEquals("A digit", actualValue);
    }




}
