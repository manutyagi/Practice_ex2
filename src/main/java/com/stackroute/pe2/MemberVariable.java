package com.stackroute.pe2;

import java.math.BigDecimal;

public class MemberVariable {

	public static void main(String[] args) {
	Member m = new Member("Manu",23,new BigDecimal(12456780.0987));
	System.out.println(m.getName());
	System.out.println(m.getAge());
	System.out.println(m.getSalary());
   }
}
