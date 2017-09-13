package com.niit.onlineshoppingbackend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.onlineshoppingbackend.dao.CategoryDao;
import com.niit.onlineshoppingbackend.dto.Category;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDao categoryDao;
	
	private Category category;
	
	@BeforeClass
	public static void init(){
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.onlineshoppingbackend");
		context.refresh();
		categoryDao = (CategoryDao) context.getBean("categoryDao");
		
	}
	@Test
	public void testAddCategory()
	{
		category = new Category();
		
		category.setName("TV");
		category.setDescription("This is a television");
		category.setImageUrl("CAT_1.png");

		assertEquals("Succesfully added a category inside the table",true,categoryDao.add(category));
	}
}
