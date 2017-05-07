package com.conferor.patterns.nullobject;

public class Customer implements ICustomer {
	private String name;
	private int age;
	private double salary;
	
	public Customer(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public boolean isNULL() {
		return false;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}
}
