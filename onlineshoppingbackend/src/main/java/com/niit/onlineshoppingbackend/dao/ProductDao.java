package com.niit.onlineshoppingbackend.dao;


import java.util.List;

import com.niit.onlineshoppingbackend.dto.Category;
import com.niit.onlineshoppingbackend.dto.Product;

public interface ProductDao {
	void saveproduct(Product product);
	List<Product> getallproducts();
	Product getproductbyid(int id);
	void deleteproduct(Product product);
	List<Category> getallcategories();
	void savecategory(Category category);
	

}