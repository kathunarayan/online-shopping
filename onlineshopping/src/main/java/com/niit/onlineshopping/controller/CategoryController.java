package com.niit.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.onlineshoppingbackend.dao.CategoryDao;
import com.niit.onlineshoppingbackend.dto.Category;

@Controller
public class CategoryController {
	@Autowired
	private CategoryDao categorydao;

	@RequestMapping("/admin/category/getcategoryform")
	public String getaddcategory(Model model) {
		model.addAttribute("category", new Category());
		return "AddCategory";
	}

	@RequestMapping("/admin/savecategory")
	public String savecategory(@ModelAttribute(name = "category") Category category) {
		categorydao.saveOrUpdate(category);
		return "AddCategory";
	}

}
