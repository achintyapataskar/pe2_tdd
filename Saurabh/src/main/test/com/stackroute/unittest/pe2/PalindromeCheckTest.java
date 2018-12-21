package com.stackroute.unittest.pe2;

import org.junit.Test;


import org.junit.Assert;


    public class PalindromeCheckTest {

        @Test
        public void testForEmpty()

        {
            Assert.assertFalse(PalindromeCheck.isPalindrome(""));
        }

        @Test
        public void testForNumericString()


        {
            Assert.assertTrue(PalindromeCheck.isPalindrome("12321"));
        }

        @Test
        public void testForNormalString()

        {
            Assert.assertTrue(PalindromeCheck.isPalindrome("Madam"));
        }


    }
