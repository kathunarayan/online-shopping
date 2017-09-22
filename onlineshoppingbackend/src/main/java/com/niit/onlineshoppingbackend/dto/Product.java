package com.niit.onlineshoppingbackend.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Table(name = "Product")
@Entity
@Component
public class Product {

	@Id
	@GeneratedValue
	private int productId;
	@NotEmpty(message = "Product name should not be empty")
	@Pattern(regexp = "[a-zA-Z]*", message = "the name can only contain letters")
	private String productName;
	@NotEmpty(message = "Description should not be empty")
	private String productDescription;
	@NotNull
	private int stock;
	@Min(value = 50)
	private int price;
	@ManyToOne
	@JoinColumn(name = "cid")
	private Category category;

	private String supplierName;

	@Transient
	private MultipartFile image;

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

}
