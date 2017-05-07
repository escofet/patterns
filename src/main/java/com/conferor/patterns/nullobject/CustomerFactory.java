package com.conferor.patterns.nullobject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerFactory {
	private List<ICustomer> populatedCustomers;
	
	public CustomerFactory() {
		// Populate (from cache/database??)
		populatedCustomers = new ArrayList<>();
		populatedCustomers.add(new Customer("Eduardo", 20, 2000));
		populatedCustomers.add(new Customer("Luis", 25, 2500));
	}
	
	public CustomerFactory(List<ICustomer> customers) {
		populatedCustomers = customers;
	}
	
	// using forEach
	public ICustomer getCustomer(String name) {
		for(ICustomer cust : populatedCustomers) {
			if(cust.getName().equalsIgnoreCase(name)) {
				return cust;
			}
		}
		return new NullCustomer();
	}
	
	// Using Optional (Java 8+)
	public Optional<ICustomer> getCustomerOpt(String name) {
		return Optional.ofNullable(populatedCustomers.stream()
			.filter(cust -> cust.getName().equalsIgnoreCase(name))
			.findFirst()
			.orElse(null)
		);
	}
}
