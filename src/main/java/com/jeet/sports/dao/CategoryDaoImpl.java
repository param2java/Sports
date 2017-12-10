package com.jeet.sports.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.jeet.sports.model.Category;

@Repository
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	HibernateTemplate ht;
	public String saveCategory(Category category) {
		return (String) ht.save(category);
	}

	public void deleteCategory(String categoryId) {
			ht.delete(new Category(categoryId));
	}

	public void updateCategory(Category category) {
		 ht.update(category);
	}

	public Category getCategoryById(String categoryId) {
		return ht.get(Category.class, categoryId);
	}

	public List<Category> getAllCategorys() {
		return ht.loadAll(Category.class);
	}

	
}
