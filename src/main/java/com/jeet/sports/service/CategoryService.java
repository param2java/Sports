package com.jeet.sports.service;

import java.util.List;

import com.jeet.sports.model.Category;

public interface CategoryService {
	
	String saveCategory(Category category);
	void deleteCategory(String categoryId);
	void updateCategory(Category category);
	Category getCategoryById (String categoryId);
	List<Category> getAllCategorys();
		
}
