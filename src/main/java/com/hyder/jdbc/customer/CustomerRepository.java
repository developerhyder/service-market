package com.hyder.jdbc.customer;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repo")
public interface CustomerRepository extends CrudRepository<Customer, Integer>{

	//@Query("SELECT u FROM User u WHERE u.status = ?1 and u.name = ?2")
	//User findUserByStatusAndName(Integer status, String name);
	@Query(value="select count(*) from customer where name= ?1 and password= ?2", nativeQuery=true)
	int getCustomerByCred(String name, String password);
}
