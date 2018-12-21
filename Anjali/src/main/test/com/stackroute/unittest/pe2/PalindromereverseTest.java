package com.stackroute.unittest.pe2;
import org.junit.Test;

import static org.junit.Assert.*;
public class PalindromereverseTest {

        @Test
        public void IsPalindrome() {
            PalindromeReverse data = new PalindromeReverse();
            String actualValue = data.checkPalindrome("namiman");
            assertEquals("String is a palindrome", actualValue);
        }

            @Test
            public void NotPalindrome()
            {
                PalindromeReverse data = new PalindromeReverse();
                String actualValue1=data.checkPalindrome("namima");
                assertEquals("String is not a palindrome", actualValue1);
            }
        }
