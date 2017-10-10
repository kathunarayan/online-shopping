package com.niit.onlineshoppingbackend.daoImpl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.onlineshoppingbackend.dao.CustomerOrderDao;
import com.niit.onlineshoppingbackend.dto.Cart;
import com.niit.onlineshoppingbackend.dto.CartItem;
import com.niit.onlineshoppingbackend.dto.Customer;
import com.niit.onlineshoppingbackend.dto.CustomerOrder;
import com.niit.onlineshoppingbackend.dto.ShippingAddress;

@Repository
public class CustomerOrderDaoImpl implements CustomerOrderDao{

	@Autowired
	private SessionFactory sessionFactory;
	public CustomerOrder Createorder(Cart cart,ShippingAddress s) {
		Session session=sessionFactory.getCurrentSession();
		List<CartItem> cartitems=cart.getCartitems();
		double grandtotal=0;
		for(CartItem cartitem: cartitems)
			grandtotal=cartitem.getTotalprice()+grandtotal;
		cart.setGtotal(grandtotal);
		Customer customer= cart.getCustomer();
		CustomerOrder customerorder= new CustomerOrder();
		customerorder.setDate(new Date());
		customerorder.setCart(cart);
		customerorder.setCustomer(customer.getId());
		customerorder.setBillingaddress(customer.getBillingAddress());
		customerorder.setShippingaddress(s.getId());
		//System.out.println(customerorder.getCustomer()+ " "+customerorder.getShippingaddress().getCountry());
		session.saveOrUpdate(customerorder);
		System.out.println("saved customer");
		return customerorder;
	}
	public List<ShippingAddress> getshippingbyid(int id) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from ShippingAddress where customer.id=?");
		query.setInteger(0, id);
		List<ShippingAddress> shipping= query.list();
		return shipping;
		
	}
	public ShippingAddress getshipping(int id) {
		Session session=sessionFactory.getCurrentSession();
		ShippingAddress shipping=(ShippingAddress) session.get(ShippingAddress.class, id);
		return shipping;
	}
	public void saveshipping(ShippingAddress shipping) {
		Session session=sessionFactory.getCurrentSession();
		session.save(shipping);
		
	}
	

}