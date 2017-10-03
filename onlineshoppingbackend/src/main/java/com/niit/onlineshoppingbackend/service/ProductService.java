package com.niit.onlineshoppingbackend.service;
import java.util.List;

import com.niit.onlineshoppingbackend.dto.Category;
import com.niit.onlineshoppingbackend.dto.Product;


public interface ProductService {

	void  saveproduct(Product product);
	List<Product> getallproducts();
	Product getproductbyid(int id);
	void deleteproduct(int id);
	List<Category> getallcategories();
	void  savecategory(Category category);
	
}