package com.niit.onlineshoppingbackend.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.onlineshoppingbackend.dao.CustomerDao;
import com.niit.onlineshoppingbackend.dto.Customer;
import com.niit.onlineshoppingbackend.dto.User;
import com.niit.onlineshoppingbackend.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerdao;
	@Override
	public void registerCustomer(Customer customer) {
		customerdao.registerCustomer(customer);

	}

	@Override
	public User validateUsername(String username) {
		return customerdao.validateUsername(username);
	}

	@Override
	public Customer validateEmail(String email) {
		return customerdao.validateEmail(email);
	}

	@Override
	public Customer customerbyusername(String username) {
		return customerdao.customerbyusername(username);
	}

}
