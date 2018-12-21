



package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentAvg {

    StudentMaxMinAvg obj;
    @Before
    public void setUp() throws Exception {
        stuAverage obj = new stuAverage();
    }

    @After
    public void tearDown() throws Exception {
        stuAverage obj = null;
    }

    @Test
    public void Max_Marks() {
        int[] marks = new int[4];
        marks[0] = 72;
        marks[1] = 73;
        marks[2] = 67;
        marks[3] = 83;
        assertEquals(83,obj.stuMax(marks));
    }

    @Test
    public void Min_marks() {
        int[] marks = new int[4];
        marks[0] = 72;
        marks[1] = 73;
        marks[2] = 67;
        marks[3] = 83;
        assertEquals(72,obj.stuMin(marks));
    }

    @Test
    public void Average_Marks() {
        int[] marks = new int[4];
        marks[0] = 72;
        marks[1] = 73;
        marks[2] = 67;
        marks[3] = 83;
        assertEquals(73.75,obj.stuAverage(marks), 0.001);
    }
}