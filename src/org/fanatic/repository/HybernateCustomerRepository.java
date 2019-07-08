package org.fanatic.repository;

import java.util.*;

import org.fanatic.model.Customer;

public class HybernateCustomerRepository implements customerRepository {

	/* (non-Javadoc)
	 * @see org.fanatic.repository.customerRepository#findAll()
	 */
	public List<Customer> findAll()
	{
		List<Customer> customers = new ArrayList <Customer>();
		Customer c = new Customer();
		Customer c1 = new Customer();
		c.setFirstName("Arun");
		c.setLastName("Pratap");
		c1.setFirstName("Prateek");
		c1.setLastName("Kumar");
		customers.add(c);
		customers.add(c1);
		return customers;
	}

	
	
}
