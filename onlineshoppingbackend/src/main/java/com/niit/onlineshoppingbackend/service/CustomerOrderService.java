package com.niit.onlineshoppingbackend.service;

import java.util.List;

import com.niit.onlineshoppingbackend.dto.Cart;
import com.niit.onlineshoppingbackend.dto.CustomerOrder;
import com.niit.onlineshoppingbackend.dto.ShippingAddress;

public interface CustomerOrderService {
	
	 CustomerOrder Createorder(Cart cart, ShippingAddress s);
	 List<ShippingAddress> getshippingbyid(int id);
	 ShippingAddress getshipping(int id);
	 void saveshipping(ShippingAddress shipping);

}