package com.baby.CMS.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.baby.CMS.model.Customer;

/*
 	JDBC Procedure
 	1. Download the Driver and Link
 	2. load the driver from the library i.e. jar file
 	3. create connection to the DataBase with url. user and password
 	4. Execute CRUD operations
 	5. Close the connection
 */

public class DB implements DAO{
	Connection connection;
	final String TAG = getClass().getSimpleName();
	Statement statement;
	
	public DB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
		} catch(Exception e) {
			System.out.println("exception ocurred" + e);
		}	
	}
	
	public 	void createConnection() {
		try {
			String user = "testing";
			String password = "test";
			String url = "jdbc:mysql://localhost/testing";
			
			connection = DriverManager.getConnection(url,  user, password);
			
			System.out.println(TAG + "Connection Created, connection is closed= "+ connection.isClosed());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception ocurred" + e);
		}
		
	}
	
	public void closeConnection() {
		try {
			connection.close();
			System.out.println(TAG + " Conction was closed");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception ocurred" + e);
		}
		
	}

	@Override
	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		try {
			//Date -> YYYY-MM-DD
			//DATime -> YYYY-MM-DD hh:mm:ss
			
			SimpleDateFormat pattern1 = new SimpleDateFormat("YYYY-MM-DD");
			SimpleDateFormat pattern2 = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
			
			Date date = new Date();
			String date1 = pattern1.format(date);
			String date2 = pattern2.format(date);
			
			//System.out.println("Date1: " + date1);
			//System.out.println("Date2: " + date2);
			
			String sql = "insert into Customer values(null,'" + customer.getName() + "','" + customer.getPhone() + "','" + customer.getEmail() + "','" + customer.getBirthDate() + "','" + customer.getAge() + "','" + customer.getInDateTime()
						 + "','" + customer.getOutDateTime() + "','" + customer.getTemperature() +"')";
			System.out.println("sql is: " + sql);
			
			statement = connection.createStatement();
			int result = statement.executeUpdate(sql);
			String message = result  > 0 ? "Customer Created Successfully" : "Customer Not Created. Please Try Again";
			System.out.println(TAG + message);
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception ocuured: " + e);
		}
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		try {
			String sql = "update Customer set name = '" + customer.getName() + "',phone='" + customer.getPhone() + "',email='" + customer.getEmail() + "',birthDate='" + customer.getBirthDate() + "',age=" + customer.getAge() + ",inDateTime='" + customer.getInDateTime()
						 + "',outDateTime='" + customer.getOutDateTime() + "',temperature=" + customer.getTemperature() +" where cid=" + customer.getCid();
			System.out.println("sql is: " + sql);
		
			statement = connection.createStatement();
			int result = statement.executeUpdate(sql);
			String message = result  > 0 ? "Customer Created Successfully" : "Customer Not Created. Please Try Again";
			System.out.println(TAG + message);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception ocuured: " + e);
		}
	}

	@Override
	public void deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		try {
			String sql = "delete from Customer where cid = " + cid;
			statement = connection.createStatement();
			int result =statement.executeUpdate(sql);
			
			String message = result > 0 ? "Customer Deleted Successfully" : "Customer Not Deleted. Please Try Again";
			System.out.println(TAG + message);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception ocuured: " + e);
		}
	}

	@Override
	public ArrayList<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		ArrayList<Customer> customers = new  ArrayList<Customer>();
		
		try {
			String sql = "select * from Customer";
			statement = connection.createStatement();
			ResultSet set = statement.executeQuery(sql);
			
			while(set.next()) {
				Customer customer =new Customer();
				customer.setCid(set.getInt(1));
				customer.setName(set.getString(2));
				customer.setPhone(set.getString(3));
				customer.setEmail(set.getString(4));
				customer.setBirtDate(set.getString(5));
				customer.setAge(set.getInt(6));
				customer.setInDateTime(set.getString(7));
				customer.setoutDateTime(set.getString(8));
				customer.setTemperature(set.getFloat(9));			
			
				customers.add(customer);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception ocuured: " + e);
		}
		
		
		return customers;
	}

}
