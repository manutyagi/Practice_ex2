package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.pe2.EvenNumTest;
import com.stackroute.pe2.Member;

public class EvenNumTestTest {
	
	public static EvenNumTest evenOrOdd ;
	
	@Before
	public void setup() {
		evenOrOdd = new EvenNumTest();
	}
	
	@After
	public void teardown() {
		evenOrOdd = null;
	}
	@Test
	public void notANumber() {
		assertFalse("INput not recognised",evenOrOdd.isEven(""));
	}
	@Test
	public void testEven() {
		assertTrue("The input number is an even number",evenOrOdd.isEven("44"));
	}
	@Test
	public void testNotEven() {
		assertFalse("The input number is not an even number",evenOrOdd.isEven("45"));
	}

}
