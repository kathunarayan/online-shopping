package com.niit.onlineshoppingbackend.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.onlineshoppingbackend.dao.CustomerOrderDao;
import com.niit.onlineshoppingbackend.dto.Cart;
import com.niit.onlineshoppingbackend.dto.CustomerOrder;
import com.niit.onlineshoppingbackend.dto.ShippingAddress;
import com.niit.onlineshoppingbackend.service.CustomerOrderService;


@Service
@Transactional
public class CustomerOrderServiceImpl implements CustomerOrderService {
	
	@Autowired
	private CustomerOrderDao customerorderdao;

	public CustomerOrder Createorder(Cart c, ShippingAddress ship) {
		return customerorderdao.Createorder(c,ship);
	}

	public List<ShippingAddress> getshippingbyid(int id) {
		
		return customerorderdao.getshippingbyid(id);
	}

	public ShippingAddress getshipping(int id) {
		return customerorderdao.getshipping(id);
	}

	public void saveshipping(ShippingAddress shipping) {
		customerorderdao.saveshipping(shipping);
		
	}

}