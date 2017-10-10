package com.niit.onlineshoppingbackend.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.onlineshoppingbackend.dao.CartItemDao;
import com.niit.onlineshoppingbackend.dto.Cart;
import com.niit.onlineshoppingbackend.dto.CartItem;
import com.niit.onlineshoppingbackend.service.CartItemService;

@Service
@Transactional
public class CartItemServiceImpl implements CartItemService {
	
	@Autowired
	private CartItemDao cartitemdao;
	
	public void addtocart(CartItem cartitem) {	
		cartitemdao.addtocart(cartitem);
	}

	public void removecartitem(int cartitemid) {
		cartitemdao.removecartitem(cartitemid);	
	}

	public void removeallcartitem(int cartid) {
		cartitemdao.removeallcartitem(cartid);
	}

	public Cart getCart(int id) {
		return cartitemdao.getCart(id);
	}

	public void aftercheckout(int cartid) {
		cartitemdao.aftercheckout(cartid);
	}

	public int getcartcount(int id) {
		return cartitemdao.getcartcount(id);
	}
	

}