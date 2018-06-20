package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.pe2.PowerFour;

public class PowerFourTest {
	public static PowerFour powerOfFour ;
	
	@Before
	public void setup() {
		powerOfFour = new PowerFour();
	}
	
	@AfterClass
	public static void teardown() {
		powerOfFour = null;
	}
	@Test
	public void testInputNumberPowerOfFour() {
		assertTrue(
                "The given input is a power of four", powerOfFour.power("16"));

	}
	@Test
	public void testInputAnyNumber() {
		assertFalse(
				"Test for number not a power of four",powerOfFour.power("19"));
	}
	@Test
	public void testInputNotANumber() {
		assertFalse(
				"You have input a wrong character input",powerOfFour.power("#"));
	}
	@Test
	public void testInputEqualOne() {
		assertTrue(
				
				"You have entered an input equal to one",powerOfFour.power("1"));
		
	}	
}
