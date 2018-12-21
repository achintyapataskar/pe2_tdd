import org.junit.Test;

import static org.junit.Assert.*;

public class PowerfourTest {
    @Test

    public void Powerck(){
       Powerfour pw = new Powerfour();
       assertEquals("yes",pw.Powercheck(16));

    }

    @Test

    public void Powerck1(){
        Powerfour pw1 = new Powerfour();
        assertEquals("yes",pw1.Powercheck(1));

    }
    @Test

    public void Powerck2(){
        Powerfour pw2 = new Powerfour();
        assertEquals("no",pw2.Powercheck(0));

    }
    @Test

    public void Powerck3(){
        Powerfour pw3 = new Powerfour();
        assertEquals("no",pw3.Powercheck(15));

    }
 @Test

    public void Powerck3(){
        Powerfour pw3 = new Powerfour();
        assertEquals("yes",pw3.Powercheck(64));

    }


}
