package com.stackroute.unittest.pe2;

public class IsPowerOfFour {

        public String checkPower(int n)
        {
            String result="";
            if(n == 0) {
                result = "Zero Number";
                return result;
            }
            while(n != 1)
            {
                if(n % 4 != 0){
                    result="Not power of four";
                    return result;
                }
                n = n / 4;
            }
            result="power of four";
            return result;
        }
}
