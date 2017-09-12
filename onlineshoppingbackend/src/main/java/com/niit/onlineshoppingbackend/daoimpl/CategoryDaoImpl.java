package com.niit.onlineshoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.onlineshoppingbackend.dao.CategoryDao;
import com.niit.onlineshoppingbackend.dto.Category;


@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	public static List<Category> categories = new ArrayList<Category>();
	
	static{
		Category category = new Category();
		//adding first category
		category.setId(1);
		category.setName("TV");
		category.setDescription("This is a television");
		category.setImageUrl("CAT_1.png");
		
		categories.add(category);
		
		category = new Category();
		//adding second category
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is a television");
		category.setImageUrl("CAT_2.png");
		
		categories.add(category);
		
		category = new Category();
		//adding third category
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is a television");
		category.setImageUrl("CAT_3.png");
		
		categories.add(category);
	}
	
	
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
