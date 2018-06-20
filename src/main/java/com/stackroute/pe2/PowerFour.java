package com.stackroute.pe2;

public class PowerFour {

    public boolean power(String input) {
        try {
            int num = Integer.parseInt(input);
            while(num > 0) {
                if(num == 1) {
                    return true;
                }
                if(num % 4 != 0) {
                    return false;
                } else {
                    num = num / 4;
                }
            }
        }
        catch(NumberFormatException e) {
            return false;
        }
        
        return false;
    }
}
