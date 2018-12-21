package com.stackroute.unittest.pe2;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPowerOfFourTest {

    @Test
        public void IsPowerOfFour() {
            IsPowerOfFour data = new IsPowerOfFour();
            String actualValue = data.checkPower(64);
            assertEquals("power of four", actualValue);
        }

        @Test
        public void NotPowerOfFour()
        {
            IsPowerOfFour data = new IsPowerOfFour();
            String actualValue1=data.checkPower(65);
            assertEquals("Not power of four", actualValue1);
        }

        @Test
        public void ZeroTest()
        {
            IsPowerOfFour data = new IsPowerOfFour();
            String actualValue1=data.checkPower(0);
            assertEquals("Zero Number", actualValue1);
        }
    }
