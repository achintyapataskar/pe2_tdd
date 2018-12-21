package com.stackroute.unittest.pe2;
public class PalindromeReverse {
         public String checkPalindrome(String str)
        {
            String rev = "";
            String result="";

            int length = str.length();

            for ( int i = length - 1; i >= 0; i-- )
                rev = rev + str.charAt(i);

            if (str.equals(rev))
                result="String is a palindrome";
            else
                result="String is not a palindrome";
            return result;
        }
    }

