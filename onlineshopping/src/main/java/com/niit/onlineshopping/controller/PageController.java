package com.niit.onlineshopping.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class PageController {
	
	/*@Autowired
	private CategoryDao categoryDao;*/
	
	@RequestMapping(value={"/","/Home","/index"})
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("Home");
		//passing the list of categories
		//mv.addObject("categories", categoryDao.list());
		mv.addObject("title", "Home");
		mv.addObject("userClicksHome",true);
		return mv;
	}
	/*@RequestMapping(value="/about")
	public ModelAndView about(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClicksAbout",true);
		return mv;
	}
	@RequestMapping(value="/contact")
	public ModelAndView contact(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClicksContact",true);
		return mv;
	}
	
	 
	 * methods to load all the products based on category
	 
	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllProducts(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "All Products");
		//passing the list of categories
		//mv.addObject("categories", categoryDao.list());
		
		mv.addObject("userClicksAllProducts",true);
		return mv;
	} 
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id){
		ModelAndView mv=new ModelAndView("page");
		//categoryDao to fetch a single category
		//Category category = null;
		//category = categoryDao.get(id);
		//mv.addObject("title", category.getName());
		//passing the list of categories
		//mv.addObject("categories", categoryDao.list());
		//passing the single category object
		//mv.addObject("category", category);
		
		mv.addObject("userClicksCategoryProducts",true);
		return mv;
	} 

*/}
