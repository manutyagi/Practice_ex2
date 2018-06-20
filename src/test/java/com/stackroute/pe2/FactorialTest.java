package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
	
public static Factorial32 factorial ;
	
	@Before
	public void setup() {
		factorial = new Factorial32();
	}
	
	@After
	public  void teardown() {
		factorial = null;
	}
	@Test
	public void testInputUnity() {
		assertEquals("The factorial of one is one so fact(1)=1","1",factorial.checkFactorial("1"));
	}
	@Test
	public void testInputNormal() {
		assertEquals("The factorial of a positive integer greater than zero is returned as :","120",factorial.checkFactorial("5"));
	}
	@Test
	public void testInputChar() {
		assertEquals("Please input a proper integer :","120",factorial.checkFactorial("5"));
	}
	@Test
	public void testInputOutOfRange() {
		assertEquals("Factorial value greater than 32-bit integer value","Out of Range",factorial.checkFactorial("11"));
	}
}
