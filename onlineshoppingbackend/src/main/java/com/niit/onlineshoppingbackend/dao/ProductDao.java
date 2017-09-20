package com.niit.onlineshoppingbackend.dao;

import java.util.List;

import com.niit.onlineshoppingbackend.dto.Product;

public interface ProductDao {
	public List<Product> list();

	public List<Product> list(String category);

	public Product get(int product_Id);

	public void saveOrUpdate(Product product);

	public void delete(int product_Id);

	public List<Product> search(String keyWord);

}
