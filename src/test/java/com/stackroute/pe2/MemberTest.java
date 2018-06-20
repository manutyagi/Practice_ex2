package com.stackroute.pe2;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.pe2.Member;

public class MemberTest {
	public static Member memberVar ;
	
	@Before
	public void setup() {
		memberVar = new Member(null, 0, null);
	}
	
	@After
	public void teardown() {
		memberVar = null;
	}
	@Test
	public void testInputName() {
		memberVar.setName("Manu");
		assertEquals("This is the given name","Manu",memberVar.getName());
	}
	@Test
	public void testInputAge() {
		memberVar.setAge(23);
		assertEquals("Thsi is the given age",23,memberVar.getAge());
	}
	@Test
	public void testInputSalary() {
		BigDecimal expectedValue = new BigDecimal(12456780.0987);
		memberVar.setSalary(new BigDecimal(12456780.0987));
		assertEquals("This is the salary",expectedValue,memberVar.getSalary());
	}

}
