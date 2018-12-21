package com.stackroute.unittest.pe1;

import org.junit.Before;
import org.junit.Test;

public class PalindromeCheckTest {
    PalindromeCheck obj;
    @Before
    public void setUp() throws Exception {
        obj=new PalindromeCheck();
    }

    @Test
    public void reverseIsaPalindrome() {
        String result=obj.Ispalindrome("nitin");
        String expected="String is palindrome";
        assertEquals(expected,result);
    }

    @Test
    public void reverseNotPalindrome() {
        String result=obj.Ispalindrome("Ram");
        String expected="String is not palindrome";
        assertEquals(expected,result);
    }

}