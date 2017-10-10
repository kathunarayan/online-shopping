package com.niit.onlineshopping.controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.onlineshoppingbackend.dto.Cart;
import com.niit.onlineshoppingbackend.dto.Customer;
import com.niit.onlineshoppingbackend.dto.CustomerOrder;
import com.niit.onlineshoppingbackend.dto.ShippingAddress;
import com.niit.onlineshoppingbackend.service.CartItemService;
import com.niit.onlineshoppingbackend.service.CustomerOrderService;
import com.niit.onlineshoppingbackend.service.CustomerService;

@Controller
public class CustomerOrderController {

	@Autowired
	private CartItemService cartitemservice;

	@Autowired
	private CustomerService customerservice;

	@Autowired
	private CustomerOrderService customerorderservice;

	
	@RequestMapping("/cart/order/{id}")
	public String createorder(@ModelAttribute ShippingAddress shippingaddress,HttpSession session, Model model,@PathVariable int id) {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = user.getUsername();
		Customer customer = customerservice.customerbyusername(username);
		Cart cart = customer.getCart();
		ShippingAddress s=customerorderservice.getshipping(id);
		cart.setCustomer(customer);
		CustomerOrder customerorder = customerorderservice.Createorder(cart,s);
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date date = new Date();
		Random rand = new Random();
		int i = 2 + rand.nextInt(3);
		System.out.println(i);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE, i);
		String d = sdf.format(c.getTime());
		System.out.println(d);
		int dd = c.get(Calendar.DATE);
		long yy = c.get(Calendar.YEAR);
		String mm = new SimpleDateFormat("MMM").format(c.getTime());
		String day = new SimpleDateFormat("EE").format(c.getTime());
		String delivery=day + ", " + mm + " " + dd + " " + yy;
		session.setAttribute("delivery",delivery);
		session.setAttribute("username",username);
		model.addAttribute("order", customerorder);
		model.addAttribute("Cartid", cart.getId());
		return "OrderDetails";
	}

	@RequestMapping("/cart/confirm")
	public String confirm() {
		return "Payment";
	}
	
	@RequestMapping("/cart/thankyou")
	public String cash(Model model) {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = user.getUsername();
		Customer customer = customerservice.customerbyusername(username);
		Cart cart = customer.getCart();
		cartitemservice.aftercheckout(cart.getId());
		return "ThankYou";
	}

}