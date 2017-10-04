package com.niit.onlineshoppingbackend.dao;

import com.niit.onlineshoppingbackend.dto.Customer;
import com.niit.onlineshoppingbackend.dto.User;

public interface CustomerDao {
	void registerCustomer(Customer customer);
	User validateUsername(String username);
	Customer validateEmail(String email);
	Customer customerbyusername(String username);
}
