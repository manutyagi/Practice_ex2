package com.stackroute.pe2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.pe2.ReverseAndPalindrome;

public class ReverseAndPalindromeTest {
	public static ReverseAndPalindrome reverseandpalindrome ;
	
	@BeforeClass
	public static void setup() {
		reverseandpalindrome = new ReverseAndPalindrome();
	}
	
	@AfterClass
	public static void teardown() {
		reverseandpalindrome = null;
	}

	public void testIsPalindromeNormal() {

        assertTrue(
                "The given string is a palindrome.", reverseandpalindrome.isPalindrome("abccba"));

    }
    
    @Test
    public void testIsNotPalindrome() {

        assertFalse(
                "The string is not a Palindrome", reverseandpalindrome.isPalindrome("abb"));

    }
    
    @Test
    public void testIsPalindromeOneChar() {

        assertTrue(
                "If you enter just a single character,it is a palindrome", reverseandpalindrome.isPalindrome("a"));

    }
    
    @Test
    public void testIsPalindromeNull() {

        assertFalse(
                "Check if string is a palindrome in case value of string is null", reverseandpalindrome.isPalindrome(""));

    }
    
    @Test
    public void testReverseStringNormal() {

        assertEquals(
                "Return reverse string for general case", "cabba", reverseandpalindrome.reverseString("abbac"));

    }
    
    @Test
    public void testReverseStringOneChar() {

        assertEquals(
                "Return reverse string for one case", "a", reverseandpalindrome.reverseString("a"));

    }
    
    @Test
    public void testReverseStringNull() {

        assertNull(
                "Return null for null string", reverseandpalindrome.reverseString(""));

    }
   
	

}
