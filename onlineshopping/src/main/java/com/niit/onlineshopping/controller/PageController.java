package com.niit.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.onlineshoppingbackend.dao.CategoryDao;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDao categoryDao;
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("page");
		//passing the list of categories
		mv.addObject("categories", categoryDao.list());
		mv.addObject("title", "Home");
		mv.addObject("userClicksHome",true);
		return mv;
	}
	@RequestMapping(value="/about")
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

}
