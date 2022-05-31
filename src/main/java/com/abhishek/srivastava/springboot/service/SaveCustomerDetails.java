package com.abhishek.srivastava.springboot.service;

import com.abhishek.srivastava.springboot.model.customer;

public interface SaveCustomerDetails {

	public boolean UpdateDetails(customer customer);
	public void DeleteDetails();
	
}
