package com.niit.onlineshopping.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		//mv.addObject("userClicksHome",true);
		return mv;
	}
	@RequestMapping(value="/Register")
	public ModelAndView register(){
		ModelAndView mv=new ModelAndView("Register");
		mv.addObject("title", "Sign Up");
		//mv.addObject("userClicksRegister",true);
		return mv;
	}
	@RequestMapping("/Login")
	public String login(@RequestParam(value = "error", required = false) String error, 
			@RequestParam(value = "logout", required = false) String logout, Model model)
	{
		if(error != null) {
			model.addAttribute("error", "Username or Password Incorrect");
			}
		
		if(logout != null) {
			model.addAttribute("logout", "Logged out Successfully");
			}
		return "Login";
	}
	/*@RequestMapping(value="/AddProduct")
	public ModelAndView addproduct(){
		ModelAndView mv=new ModelAndView("AddProduct");
		mv.addObject("title", "Add Product");
		//mv.addObject("userClicksRegister",true);
		return mv;
	}*/
	/*@RequestMapping(value="/AddCategory")
	public ModelAndView addcategory(){
		ModelAndView mv=new ModelAndView("AddCategory");
		mv.addObject("title", "Add Category");
		//mv.addObject("userClicksRegister",true);
		return mv;
	}*/
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
