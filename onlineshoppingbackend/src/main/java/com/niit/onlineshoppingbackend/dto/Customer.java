package com.niit.onlineshoppingbackend.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	@NotEmpty
	private String fname;
//	@NotEmpty
	private String lname;
	@Column(name = "emailid", unique = true, nullable = false, columnDefinition = "VARCHAR(35)")
	private String email;
	@NotEmpty
	@Size(min = 10, max = 10)
	private String phone;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userId")
	@Valid
	private User user;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="billAdId")
	@Valid
	private BillingAddress billingAddress;
	/*@OneToMany(mappedBy="customer",cascade = CascadeType.ALL)
	private List<ShippingAddress> shippingaddress;
	*/@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cartId")
	private Cart cart;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public BillingAddress getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}
	/*public List<ShippingAddress> getShippingaddress() {
		return shippingaddress;
	}
	public void setShippingaddress(List<ShippingAddress> shippingaddress) {
		this.shippingaddress = shippingaddress;
	}*/
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	
}
