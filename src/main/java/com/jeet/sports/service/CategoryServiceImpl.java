package com.jeet.sports.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeet.sports.dao.CategoryDao;
import com.jeet.sports.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDao dao;

	@Transactional(readOnly = false)
	public String saveCategory(Category category) {
		return dao.saveCategory(category);
	}

	@Transactional(readOnly = false)
	public void deleteCategory(String categoryId) {
		dao.deleteCategory(categoryId);
	}

	@Transactional(readOnly = false)
	public void updateCategory(Category category) {
		dao.updateCategory(category);
	}

	public Category getCategoryById(String categoryId) {
		return dao.getCategoryById(categoryId);
	}

	public List<Category> getAllCategorys() {
		return dao.getAllCategorys();
	}

}
