package com.stackroute.pe2;

public class Factorial64 {
	   public String checkFactorial(String number) {
		   String s="";
	   try {
		   long num = Integer.parseInt(number);
		   if(num>20) {
			   for(int i=1;i<=20;i++) {
				   s=fact(i)+"";
			   }
			   s= "Factorial of "+num+" is Out of Range";
			   System.out.println(s);
		   }
		   else {
			   for(int i=1;i<=num;i++) {
				   s=fact(i)+"";
			   }
		   }	   
	   }catch(NumberFormatException e) {
		   return "Number format exception : Enter a proper integer";
	   }
	   return s;
   }
	   public long fact(long num) {
		   long r = 1;
		   for (int i = 1;i <=num ;i++) {
			   r = r*i;
		   }
		   System.out.println("Factorial of "+num+" is "+r);
		   return r;
	   }
	   public static void main(String[] args) {
		   Factorial64 fct =new Factorial64();
		   fct.checkFactorial("21");
	   }
	}
