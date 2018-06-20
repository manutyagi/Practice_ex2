package com.stackroute.pe2;

public class ReverseAndPalindrome {
	/*The following method takes in string input ,revrses it and compares if the original
	 * and reverse are the same.*/
	public boolean isPalindrome(String input) {
		String s = input;
		String str = reverseString(s);
		if(str==null||str.equals("") || !str.equals(s)) {
			return false;
		}else{
			return true;
		}
	}
	public String reverseString(String input) {
		int len=input.length();
		String rev="";
		if(!input.equals(""))
		for(int i=len-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}else {
			return null;
		}
		return rev;	
	}
	public static void main(String[] args) {
		ReverseAndPalindrome rpal = new ReverseAndPalindrome();
		rpal.isPalindrome("abccb");
	}
}
