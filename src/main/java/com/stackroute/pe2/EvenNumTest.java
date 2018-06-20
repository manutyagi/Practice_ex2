package com.stackroute.pe2;

public class EvenNumTest {
	
		public static boolean isEven(String num) {
			try {
				int number = Integer.parseInt(num);
				if(number % 2 ==0) 
					return true;
				else 
					return false;
			}catch(NumberFormatException e) {
				return false;
		}
	}
}
