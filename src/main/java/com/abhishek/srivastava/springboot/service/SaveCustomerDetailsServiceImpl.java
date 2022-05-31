package com.abhishek.srivastava.springboot.service;

import com.abhishek.srivastava.springboot.model.customer;
import com.abhishek.srivastava.springboot.dao.SaveCustomerdaoImpl;
public class SaveCustomerDetailsServiceImpl implements SaveCustomerDetails {

boolean success = false;

SaveCustomerdaoImpl save = new SaveCustomerdaoImpl();

	@Override
	public boolean UpdateDetails(customer customer) {
		// TODO Auto-generated method stub
		success = save.UpdateDetails(customer);
		return success;
		
	}

	@Override
	public void DeleteDetails() {
		// TODO Auto-generated method stub
		
	}

}
