package com.abhishek.srivastava.springboot.dao;

import com.abhishek.srivastava.springboot.model.customer;

public interface SaveCustomerdao {

	public boolean UpdateDetails(customer customer);
	public void DeleteDetails();
	
}
