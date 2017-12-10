package com.jeet.sports.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
public class Category {

	@Id
	@Column(name="CATEGORY_ID")
	private String categoryId;
	@Column(name="CATEGORY_NAME")
	private String categoryName;
	
	
	public Category() {
	}


	public Category(String categoryId) {
		this.categoryId = categoryId;
	}


	public String getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName="
				+ categoryName + "]";
	}
	
	
}
