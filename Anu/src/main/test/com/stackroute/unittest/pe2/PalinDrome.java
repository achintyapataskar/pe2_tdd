package com.stackroute.pe1;

package com.stackroute.unittest.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalinDrome {

    @Test
    public void conditionfalse() {
        int num = 455;
        String expected = "455 is not a palindrome";
        PalinDrome obj = new PalinDrome();
        String xyz = obj.fun(num);
        assertEquals(expected, xyz);

    }
    @Test
    public void conditiontrue() {
        int num = 123321;
        String expected = "123321 is a palindrome";
        PalinDrome obj = new PalinDrome();
        String xyz = obj.fun(num);
        assertEquals(expected, xyz);

    }


}