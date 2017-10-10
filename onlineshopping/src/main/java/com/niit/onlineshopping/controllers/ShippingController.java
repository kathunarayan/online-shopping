package com.niit.onlineshopping.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.onlineshoppingbackend.dto.Customer;
import com.niit.onlineshoppingbackend.dto.ShippingAddress;
import com.niit.onlineshoppingbackend.service.CustomerOrderService;
import com.niit.onlineshoppingbackend.service.CustomerService;

@Controller
public class ShippingController {
	
	@Autowired
	private CustomerOrderService customerorderservice;
	
	@Autowired
	private CustomerService customerservice;
	
	@RequestMapping("/cart/shippingaddressform")
	public String getShippingform(Model model) {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = user.getUsername();
		Customer customer = customerservice.customerbyusername(username);
		int id=customer.getId();
		System.out.println(id);
		List<ShippingAddress> shipping= customerorderservice.getshippingbyid(id);
		System.out.println(shipping.size());
		model.addAttribute("shipping", shipping);
		model.addAttribute("shippingaddress", new ShippingAddress());
		return "ShippingAddress";

	}
	
	@RequestMapping("/cart/add/shipping")
	public String addShipping(@ModelAttribute (name="shippingaddress") ShippingAddress shipping){
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = user.getUsername();
		Customer customer = customerservice.customerbyusername(username);
		shipping.setCustomer(customer);
		customerorderservice.saveshipping(shipping);
		return "redirect:/cart/shippingaddressform";
	}

}