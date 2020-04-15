package com.hyder.jdbc.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@RequestMapping(method= RequestMethod.POST, value="/signup")
	public String signUp(@RequestBody Customer customer) {
		return service.signUp(customer);
	}
	
	@RequestMapping("/signin/{username}/{password}")
	public String signIn(@PathVariable String username, @PathVariable String password) {
		return service.signIn(username, password);
	}
	
}
