package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentsAndGradesTest {
	public static StudentsAndGrades studentgrades ;
	
	@Before
	public void setup() {
		studentgrades = new StudentsAndGrades();
	}
	
	@After
	public  void teardown() {
		studentgrades = null;
	}
	@Test
	public void testIntArrayInput() {
		assertEquals("83.2",studentgrades.calculateAvg("5",new int [] {86,65,98,77,90}));
	}
	@Test
	public void testEmptyInput() {
		assertEquals(null,studentgrades.calculateAvg("",new int [] {}));
	}
	@Test
	public void testArrayLengthLessThanInputNumber() {
		assertEquals("Array Index out of bounds",null,studentgrades.calculateAvg("5",new int [] {86,65,98,77}));
	}
}
