package com.hyder.jdbc.customer;

public interface CustomerInterface {
	//This interface will have all the important methods for all the operation 
	//implement this method as a service and add a controller to show all the required request mappings
	//while implementing use a temporary database
	
	//for signup use @RequestBody
	public String signUp(Customer customer);
	
	//for signin use @PathVariable
	public String signIn(String userName, String password);
	
}
