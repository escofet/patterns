package com.conferor.patterns.nullobject;

public class NullCustomer implements ICustomer {

	public boolean isNULL() {
		return true;
	}

	public String getName() {
		return "Name not available";
	}

	public int getAge() {
		return 0;
	}

	public double getSalary() {
		return 0;
	}
}
