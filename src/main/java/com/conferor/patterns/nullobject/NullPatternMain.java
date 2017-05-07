package com.conferor.patterns.nullobject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NullPatternMain {
	public static void main(String[] args) {
		CustomerFactory factory = new CustomerFactory();
		
		String searchName = "Eduardo";
		ICustomer cust = factory.getCustomer(searchName);
		
		// First example
		if(cust instanceof Customer) {
			System.out.println(searchName + "'s age is " + cust.getAge());
		} else {
			System.out.println(searchName + " doesn't exist in our data");
		}
		
		// Second example
		if(cust.isNULL()) {
			System.out.println(searchName + " doesn't exist in our data");
		} else {
			System.out.println(searchName + "'s age is " + cust.getAge());
		}
		
		// Third example
		List<ICustomer> myCustomers = new ArrayList<>();
		myCustomers.add(new Customer("Elena", 20, 2000));
		myCustomers.add(new Customer("Julia", 25, 2500));
		CustomerFactory myFactory = new CustomerFactory(myCustomers);
		myCustomers.add(new Customer("Alex", 30, 3000));
		System.out.println(myFactory.getCustomer("Alex").getSalary());
		
		// Fourth example
		Optional<ICustomer> optCustomer = factory.getCustomerOpt(searchName);
		System.out.println(optCustomer.isPresent() 
			? String.format("%s's age is %d", searchName, optCustomer.get().getAge())
			: String.format("%s doesn't exist in our data", searchName)
		);
	}
}
