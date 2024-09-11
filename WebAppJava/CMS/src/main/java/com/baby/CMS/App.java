package com.baby.CMS;

import java.util.ArrayList;

import com.baby.CMS.db.DB;
import com.baby.CMS.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*System.out.println("Welcome to Customer Management System");
    	
    	
    	Customer customer = new Customer();
    	customer.setName("angel");
    	customer.setPhone("619-891-1919");
    	customer.setEmail("test@test.com");
    	customer.setBirtDate("1980-01-01");
    	customer.setAge(21);
    	customer.setInDateTime("2024-01-01 10:00:00");
    	customer.setoutDateTime("2025-01-01 10:00:00");
    	customer.setTemperature(80.0f);
    	
    	System.out.println("Connecting to DB....");
        DB db = new DB();
        db.createConnection();
        db.createCustomer(customer);
        db.closeConnection();
    	*/
    	
    	/*
    	Customer customer = new Customer();
    	customer.setCid(4);
    	customer.setName("eduardo");
    	customer.setPhone("645-891-1919");
    	customer.setEmail("jorge@test.com");
    	customer.setBirtDate("1989-01-01");
    	customer.setAge(21);
    	customer.setInDateTime("2024-01-01 10:00:00");
    	customer.setoutDateTime("2025-01-10 10:00:00");
    	customer.setTemperature(90.0f);
    
        System.out.println("Connecting to DB....");
        DB db = new DB();
        db.createConnection();
        db.updateCustomer(customer);
        db.closeConnection();
        */
    	
    	/*
    	System.out.println("Connecting to DB....");
        DB db = new DB();
        db.createConnection();
  
        
        ArrayList<Customer> customers = db.getAllCustomers();
        customers.forEach(customer -> System.out.println(customers));
        
        db.closeConnection();
    	*/
    	
    	
        DB db = new DB();
        db.createConnection();
        db.deleteCustomer(2);
        db.closeConnection();
        
    }
}
