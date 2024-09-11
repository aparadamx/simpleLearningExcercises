package com.baby.CMS.db;

import java.util.ArrayList;

import com.baby.CMS.model.Customer;

public interface DAO {
	//we will declare methods for CRUD operations
	void createConnection();
	void closeConnection();
	
	//declare methods for customer
	void createCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(int cid);
	ArrayList<Customer> getAllCustomers();
}
