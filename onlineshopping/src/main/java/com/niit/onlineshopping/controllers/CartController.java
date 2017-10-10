package com.niit.onlineshopping.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.onlineshoppingbackend.dto.Cart;
import com.niit.onlineshoppingbackend.dto.CartItem;
import com.niit.onlineshoppingbackend.dto.Customer;
import com.niit.onlineshoppingbackend.dto.Product;
import com.niit.onlineshoppingbackend.service.CartItemService;
import com.niit.onlineshoppingbackend.service.CustomerService;
import com.niit.onlineshoppingbackend.service.ProductService;

@Controller
public class CartController {

	@Autowired
	private CustomerService customerservice;
	@Autowired
	private ProductService productservice;
	@Autowired
	private CartItemService cartitemservice;

	@RequestMapping("/cart/minus/{id}")
	public String minus(@PathVariable int id, Model model) {
		Product product = productservice.getproductbyid(id);
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = user.getUsername();
		Customer customer = customerservice.customerbyusername(username);
		Cart cart = customer.getCart();
		List<CartItem> cartitems = cart.getCartitems();
		System.out.println(cart.getCartitems().size());
		
			for (CartItem cartitem : cartitems) {
				if (cartitem.getProducts().getId() == id) {
					if (cartitem.getQuantity() > 1) {
					cartitem.setQuantity(cartitem.getQuantity() - 1);
					cartitem.setTotalprice(cartitem.getProducts().getPrice() * cartitem.getQuantity());
					product.setQuantity(product.getQuantity() + 1);
					productservice.saveproduct(product);
					cartitemservice.addtocart(cartitem);
					
				}
			}
		} 
			return "redirect:/cart/getcart";
	}

	@RequestMapping("/cart/plus/{id}")
	public String plus(@PathVariable int id, Model model) {
		Product product = productservice.getproductbyid(id);
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = user.getUsername();
		System.out.println(username);
		Customer customer = customerservice.customerbyusername(username);
		Cart cart = customer.getCart();
		List<CartItem> cartitems = cart.getCartitems();
		System.out.println(cart.getCartitems().size());
		for (CartItem cartitem : cartitems) {
			if (product.getQuantity() > 0) {
				if (cartitem.getProducts().getId() == id) {
					cartitem.setQuantity(cartitem.getQuantity() + 1);
					cartitem.setTotalprice(cartitem.getProducts().getPrice() * cartitem.getQuantity());
					product.setQuantity(product.getQuantity() - 1);
					productservice.saveproduct(product);
					cartitemservice.addtocart(cartitem);
					}
			}
		}
		return "redirect:/cart/getcart";
	}

	@RequestMapping("/cart/addtocart/{id}")
	public String addtocart(@PathVariable int id, @RequestParam int units, Model model) {
		Product product = productservice.getproductbyid(id);
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = user.getUsername();
		Customer customer = customerservice.customerbyusername(username);
		Cart cart = customer.getCart();
		System.out.println(cart.getCartitems().size());
		List<CartItem> cartitems = cart.getCartitems();
		for (CartItem cartitem : cartitems) {
			if(cartitem.getProducts().getId()==id){
				cartitem.setQuantity(cartitem.getQuantity()+1);
				cartitem.setTotalprice(product.getPrice()*cartitem.getQuantity());
				product.setQuantity(product.getQuantity()-1);
				productservice.saveproduct(product);
				cartitemservice.addtocart(cartitem);
				model.addAttribute("units", cartitem.getQuantity());
				if (product.getQuantity() > 0) 
					return "redirect:/cart/getcart";
				else
					return "redirect:/all/products/viewproduct/{id}";
			}
			
		}
		CartItem cartitem = new CartItem();
		cartitem.setQuantity(1);
		cartitem.setProducts(product);
		cartitem.setCart(cart);
		cartitem.setTotalprice(product.getPrice());
		product.setQuantity(product.getQuantity() - units);
		productservice.saveproduct(product);
		cartitemservice.addtocart(cartitem);
		model.addAttribute("units", cartitem.getQuantity());
		if (product.getQuantity() > 0) 
			return "redirect:/cart/getcart";
		else 
			return "redirect:/all/products/viewproduct/{id}";
	}

	@RequestMapping("/cart/getcart")
	public String getcart(HttpSession session,Model model) {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = user.getUsername();
		System.out.println(username);
		Customer customer = customerservice.customerbyusername(username);
		System.out.println(customer.getEmail());
		Cart cart = customer.getCart();
		int i = cart.getId();
    	System.out.println(cart.getCartitems().size());
		System.out.println(i);
		System.out.println(cartitemservice.getcartcount(cart.getId()));
		model.addAttribute("i", cart);
		session.setAttribute("count", cartitemservice.getcartcount(cart.getId()));
		return "Cart";
	}

	@RequestMapping("/cart/removecartitem/{cartitemid}")
	public String removecartitem(@PathVariable int cartitemid,Model model) {

		cartitemservice.removecartitem(cartitemid);
		return "redirect:/cart/getcart";
	}

	@RequestMapping("/cart/removecart/{cartid}")
	public String removecart(@PathVariable("cartid") int cartid,Model model) {

		cartitemservice.removeallcartitem(cartid);
		return "redirect:/cart/getcart";
	}

}