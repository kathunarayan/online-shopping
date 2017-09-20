package com.niit.onlineshoppingbackend;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.onlineshoppingbackend.dto.Category;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;

	//private static CategoryDao categoryDao;

	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.onlineshoppingbackend");
		context.refresh();
		//categoryDao = (CategoryDao) context.getBean("categoryDao");

	}

	/*
	 * @Test public void testAddCategory() { category = new Category();
	 * 
	 * category.setName("Laptop"); category.setDescription("This is a laptop");
	 * category.setImageUrl("CAT_2.png");
	 * 
	 * assertEquals("Succesfully added a category inside the table",true,
	 * categoryDao.add(category)); }
	 */
	/*
	 * @Test public void testUpdateCategory() { category = categoryDao.get(3);
	 * category.setName("TV");
	 * assertEquals("Succesfully updated a category from the table", true,
	 * categoryDao.update(category));
	 * 
	 * }
	 */

	/*
	 * @Test public void testDeleteCategory() { category = categoryDao.get(3);
	 * 
	 * assertEquals("Succesfully deleted a category from the table", true,categoryDao.delete(category));
	 * 
	 * }
	 */
	/*@Test
	public void testListCategory() {
		category = categoryDao.get(3);

		assertEquals("Succesfully fetched list of categories from the table", 4, categoryDao.list().size());

	}*/

	
	@Test
	public void testCRUDCategory(){
		//add operation
		category = new Category();
		category.setName("Laptop");
		category.setDescription("This is a laptop");
		category.setImageUrl("CAT_1.png");
		/*assertEquals("Successfully added a category inside the table!", true, categoryDao.saveOrUpdate(category));
		//fetching and updating the category
		category = categoryDao.get(2);
		category.setName("TV");
		assertEquals("Successfully updated a single category in the table!", true, categoryDao.editCategory(category));
		//deleting a category
		assertEquals("Succesfully deleted a category from the table", true,categoryDao.delete(category));
		//fetching the list of categories
		assertEquals("Succesfully fetched list of categories from the table", 1, categoryDao.list().size());
	*/	
	}
}
