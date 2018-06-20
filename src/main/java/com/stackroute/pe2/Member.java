package com.stackroute.pe2;

import java.math.BigDecimal;

public class Member {
	private String name;
	private int age;
	private BigDecimal salary;
	Member(String name , int age ,BigDecimal salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
	public void setSalary(BigDecimal newSalary) {
		salary = newSalary;
	}
}
