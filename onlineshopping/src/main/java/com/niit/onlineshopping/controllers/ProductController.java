package com.niit.onlineshopping.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

//import com.niit.exception.ProductNotFoundException;
import com.niit.onlineshoppingbackend.dto.Category;
import com.niit.onlineshoppingbackend.dto.Product;
import com.niit.onlineshoppingbackend.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productservice;

	@RequestMapping("/admin/products/getproductform")
	public String getaddproduct(Model model) {
		List<Category> categories = productservice.getallcategories();
		model.addAttribute("categories", categories);
		model.addAttribute("product", new Product());
		return "AddProduct";

	}

	@RequestMapping("/admin/saveproduct")
	public String saveproduct(@Valid @ModelAttribute(name = "product") Product product, BindingResult result, Model model) {
		if (result.hasErrors())
			  
			 {
			  
			  System.out.println("save product error"); 
			   List<Category> categories=productservice.getallcategories(); 
			  model.addAttribute("categories",categories); 
			  return "AddProduct"; 
			  
			 }
		productservice.saveproduct(product);
		MultipartFile image = product.getImage();
		Path path = Paths
				.get("D:\\NIIT\\Project\\shopping\\online-shopping\\onlineshopping\\src\\main\\webapp\\WEB-INF\\resources\\images\\"
						+ product.getId() + ".png");
		try {
			image.transferTo(new File(path.toString()));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "redirect:/admin/products/getproductform";
	}

	
	@RequestMapping("/all/products/getallproducts")
	public String getAllProduct(Model model) {
		List<Product> products = productservice.getallproducts();
		model.addAttribute("product", products);
		return "ProductList";
	}

	
	 @RequestMapping("/all/products/viewproduct/{id}")
	  public String getproductbyid(@PathVariable int id,Model model) { 
		 Product product=productservice.getproductbyid(id);
		 model.addAttribute("product",product); return "ProductDesc";
	  }
	 
	@RequestMapping("/admin/products/deleteproduct/{id}")
	public String deleteproductid(@PathVariable int id) {
		productservice.deleteproduct(id);
		Path path = Paths
				.get("E:\\Workspace\\eFrontend\\src\\main\\webapp\\WEB-INF\\resources\\images\\" + id + ".png");
		if (Files.exists(path)) {
			try {
				Files.delete(path);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "redirect:/all/products/getallproducts";
	}

	@RequestMapping("/admin/products/geteditproduct/{id}")

	public String geteditform(@PathVariable int id, Model model) {
		List<Category> categories = productservice.getallcategories();
		model.addAttribute("categories", categories);
		Product product = productservice.getproductbyid(id);
		model.addAttribute("product", product);
		return "AddProduct";

	}

	@RequestMapping("/all/product/searchbycategory")
	public String selectbycategory(@RequestParam String searchCondition, Model model) {

		model.addAttribute("product", productservice.getallproducts());
		if (searchCondition.equals("All"))
			model.addAttribute("searchCondition", "");
		else
			model.addAttribute("searchCondition", searchCondition);
		return "productlist";
	}

	@RequestMapping("/admin/products/getcategoryform")
	public String getaddcategory(Model model) {
		model.addAttribute("category", new Category());
		return "AddCategory";
	}

	@RequestMapping("/admin/savecategory")
	public String savecategory(@ModelAttribute(name = "category") Category category) {
		productservice.savecategory(category);
		return "redirect:/admin/products/getcategoryform";
	}

}