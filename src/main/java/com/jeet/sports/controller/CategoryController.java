package com.jeet.sports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jeet.sports.model.Category;
import com.jeet.sports.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	CategoryService service;

	@RequestMapping("/show-category")
	public String showPage() {
		return "Category-Reg";
	}
	
	@RequestMapping(value = "/insert-category", method = RequestMethod.POST)
	public String insertCategory(@ModelAttribute("category") Category category,
			ModelMap map) {
		// Save Object
		String categoryId = service.saveCategory(category);
		map.addAttribute("msg", "Category saved with Id:" + categoryId);
		return "Category-Reg";
	}
	
	@RequestMapping(value="/view-all-category")
	public String getAllCategory(@RequestParam("msg") String msg, ModelMap map){
		List<Category> list = null;
		list = service.getAllCategorys();
		if(list!=null){
			map.addAttribute("categoryList", list);
			
		}
		if(msg.equalsIgnoreCase("0")){
			map.addAttribute("msg","");
		}else{
			map.addAttribute("msg", msg);
		}
		return "Category-Data";
	}
	
	@RequestMapping(value="/edit-category")
	public String editCategory(@RequestParam("categoryId") String categoryId, ModelMap map){
		Category category = service.getCategoryById(categoryId);
		if(Category.class.isInstance(category)){
			map.addAttribute("category",category);
		}
		return "Category-Edit";
	}
	
	@RequestMapping(value="/update-category", method = RequestMethod.POST)
	public String updateCategory(@ModelAttribute("category") Category category, ModelMap map){
		if(category!=null){
			service.updateCategory(category);
		}
		
		return "redirect:/view-all-category.htm?msg=Id "+category.getCategoryId()+" is Updated";
	}
	
	@RequestMapping(value="/delete-category")
	public String updateCategory(@RequestParam("categoryId") String categoryId, ModelMap map){
		if(categoryId!=null){
			service.deleteCategory(categoryId);
		}
		
		return "redirect:/view-all-category.htm?msg=Id "+categoryId+" is Deleted";
	}
	
	
}
