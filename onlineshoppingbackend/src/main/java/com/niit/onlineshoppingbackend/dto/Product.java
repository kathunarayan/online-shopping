package com.niit.onlineshoppingbackend.dto;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
	/*@NotEmpty(message="Product name should not be empty")
	@Pattern(regexp="[a-zA-Z]*", message="the name can only contain letters")*/
private String productName;
	/*@Min(value=50)*/
private double price;
	/*@NotNull*/
private int quantity;
	/*@NotEmpty(message="Description should not be empty")*/
private String description;
	@Transient
private MultipartFile image;
/*@ManyToOne
@JoinColumn(name="cid")*/
private String category;
public MultipartFile getImage() {
	return image;
}
public void setImage(MultipartFile image) {
	this.image = image;
}
/*public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}*/
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}

}