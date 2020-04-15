package com.hyder.jdbc.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements CustomerInterface{

	@Autowired
	CustomerRepository repo;

	@Override
	public String signUp(Customer customer) {
		repo.save(customer);
		return "saved customer";
	}

	@Override
	public String signIn(String userName, String password) {
		// TODO Auto-generated method stub
		int k = repo.getCustomerByCred(userName, password);
		System.out.println("resp---one"+k);
		if(k>=1) {
			System.out.println("check - 1");
			return "login successfull";
		}else {
			return "login failed";
		}
	}

	
}
