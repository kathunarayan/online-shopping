package com.niit.onlineshoppingbackend.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Cart {
	
	@Id
	@GeneratedValue
	private String cartId;
	private String userId;
	private String userName;
	private String productName;
	private String productId;
	private int price;
	private int total;
	private int quantity;
	private String status;
	private int days;
	
	
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date addDate = new java.sql.Date(new java.util.Date().getTime());


	public String getCartId() {
		return cartId;
	}


	public void setCartId(String cartId) {
		this.cartId = cartId;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getDays() {
		return days;
	}


	public void setDays(int days) {
		this.days = days;
	}


	public Date getAddDate() {
		return addDate;
	}


	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

}
