package com.niit.onlineshoppingbackend.dao;

import com.niit.onlineshoppingbackend.dto.Cart;
import com.niit.onlineshoppingbackend.dto.CartItem;

public interface CartItemDao {

	void addtocart(CartItem cartitem);
	void removecartitem(int cartitemid);
	void removeallcartitem(int cartid);
	void aftercheckout(int cartid);
	Cart getCart(int id);
	int getcartcount(int id);
}
