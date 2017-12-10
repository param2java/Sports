package com.jeet.sports.dao;

import java.util.List;

import com.jeet.sports.model.Category;

public interface CategoryDao {
	
	String saveCategory(Category category);
	void deleteCategory(String categoryId);
	void updateCategory(Category category);
	Category getCategoryById (String categoryId);
	List<Category> getAllCategorys();
		
}
