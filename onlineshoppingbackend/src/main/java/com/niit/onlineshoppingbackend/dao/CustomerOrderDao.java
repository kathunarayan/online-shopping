package com.niit.onlineshoppingbackend.dao;

import java.util.List;

import com.niit.onlineshoppingbackend.dto.Cart;
import com.niit.onlineshoppingbackend.dto.CustomerOrder;
import com.niit.onlineshoppingbackend.dto.ShippingAddress;

public interface CustomerOrderDao {
	
	CustomerOrder Createorder(Cart cart, ShippingAddress s);
	List<ShippingAddress> getshippingbyid(int id);
	ShippingAddress getshipping(int id);
	void saveshipping(ShippingAddress shipping);
}
