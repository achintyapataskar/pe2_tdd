package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerFour {

    PowerofFour obj;

    @Before
    public void setUp() throws Exception {
        obj = new PowerofFour();
    }

    @After
    public void tearDown() throws Exception {
        PowerofFour obj = null;
    }

    @test
    public void boundaryconditions() {
        assertEquals(1,obj.powerof(0));
        assertEquals(4,obj.powerof(1));
        assertEquals(0,obj.powerof(-5));
    }
}
