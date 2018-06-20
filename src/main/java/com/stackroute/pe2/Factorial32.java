package com.stackroute.pe2;

public class Factorial32 {
	   public String checkFactorial(String number) {
		   String s="";
	   try {
		   int num = Integer.parseInt(number);
		   if(num>10) {
			   for(int i=1;i<=10;i++) {
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
	   public int fact(int num) {
		   int r = 1;
		   for (int i = 1;i <=num ;i++) {
			   r = r*i;
		   }
		   System.out.println("Factorial of "+num+" is "+r);
		   return r;
	   }
	   public static void main(String[] args) {
		   Factorial32 fct =new Factorial32();
		   fct.checkFactorial("11");
	   }
	}
