package com.stackroute.unittest.pe1;

import org.junit.Test;
import static org.junit.Assert.*;
public class MaxMinAverageTest {

    @Test
    public void MaxCheck() {
        int[] arr = new int[];
        arr[0] = 20;
        arr[1] = 24;
        arr[2] = 28;
        arr[3] = 32;
        MaxMinAverage m1= new MaxMinAverage();
        int result = m1.max(arr);

        assertArrayEquals(32,result);
    }

    @Test
    public void MinCheck() {
        int[] arr = new int[];
        arr[0] = 20;
        arr[1] = 24;
        arr[2] = 28;
        arr[3] = 32;
        MaxMinAverage m1= new MaxMinAverage();
        int result = m1.min(arr);

        assertArrayEquals(20,result);
    }

    @Test
    public void AverageCheck() {
        int[] arr = new int[];
        arr[0] = 20;
        arr[1] = 24;
        arr[2] = 28;
        arr[3] = 32;
        MaxMinAverage m1= new MaxMinAverage();
        float result = m1.average(arr);

        assertArrayEquals(26.0,result);
    }


}
