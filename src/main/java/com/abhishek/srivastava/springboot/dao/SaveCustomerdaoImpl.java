package com.abhishek.srivastava.springboot.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

//import javax.transaction.Transactional;

import com.abhishek.srivastava.springboot.model.customer;

@Component
public class SaveCustomerdaoImpl implements SaveCustomerdao {

	@Autowired
	private SessionFactory sessionfactory;
	
	
	@Transactional
	public boolean UpdateDetails(customer customer) {
		// TODO Auto-generated method stub
		boolean success = false;
		Session session = sessionfactory.openSession();
		String FirstName,LastName,Email;
		FirstName = customer.getFirstName();
		LastName = customer.getLastName();
		Email = customer.getEmail();
		String hql = "INSERT INTO customer (FirstName,LastName,Email)"+"SELECT FirstName, LastName, Email FROM customer";
		
		
		//List <customer> customers = session.createQuery("from customer",customer.class).list();
		
		Query query = session.createQuery(hql);
		int update = query.executeUpdate();
		//int update = 0;
		if(update>0)
		{
			success = true;
		}
		return success;
	}

	@Override
	public void DeleteDetails() {
		// TODO Auto-generated method stub
		
	}

}
