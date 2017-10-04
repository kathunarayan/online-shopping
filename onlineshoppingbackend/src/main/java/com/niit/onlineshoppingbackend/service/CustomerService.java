package com.niit.onlineshoppingbackend.service;

import com.niit.onlineshoppingbackend.dto.Customer;
import com.niit.onlineshoppingbackend.dto.User;

public interface CustomerService {
	void registerCustomer(Customer customer);
	User validateUsername(String username);
	Customer validateEmail(String email);
	Customer customerbyusername(String username);
}
