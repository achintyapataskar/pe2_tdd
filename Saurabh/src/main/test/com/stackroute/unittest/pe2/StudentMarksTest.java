package com.stackroute.unittest.pe2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class StudentMarksTest {


    StudentMarksTest obj;
    @Before
    public void setUp() throws Exception {
        StudentMarksTest obj = new StudentMarksTest();
    }

    @After
    public void tearDown() throws Exception {
        StudentMarksTest obj = null;
    }

    @Test
    public void studentMax() {
        int[] arr = new int[4];
        arr[0] = 50;
        arr[1] = 54;
        arr[2] = 53;
        arr[3] = 45;
        assertEquals(54,obj.StudentMax(arr));
    }

    @Test
    public void studentMin() {
        int[] arr = new int[4];
        arr[0] = 50;
        arr[1] = 54;
        arr[2] = 53;
        arr[3] = 45;
        assertEquals(45,obj.StudentMin(arr));
    }

    @Test
    public void studentAvg() {
        int[] arr = new int[4];
        arr[0] = 50;
        arr[1] = 54;
        arr[2] = 53;
        arr[3] = 45;
        assertEquals(50.4,obj.StudentAvg(arr));
    }
}