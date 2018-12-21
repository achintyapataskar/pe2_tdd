import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    @Test

        public void Palindromeck(){
            Palindrome pal=new Palindrome();
            assertEquals("palindrome",pal.Palindromeck(1001));

        }
    @Test

    public void Palindromeck1(){
        Palindrome palli=new Palindrome();
        assertEquals("palindrome",palli.Palindromeck(121121));

    }

    @Test

    public void Palindromeck2(){
        Palindrome pal2=new Palindrome();
        assertEquals("not a palindrome",pal2.Palindromeck(1231));

    }



}

