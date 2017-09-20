package com.niit.onlineshoppingbackend.dao;

import java.util.List;

import com.niit.onlineshoppingbackend.dto.Category;

public interface CategoryDao {

	public List<Category> list();

	public Category get(int id);

	public void saveOrUpdate(Category category);

	public void delete(String id);

	public void editCategory(Category category);

	public List<Category> search(String keyWord);

}
