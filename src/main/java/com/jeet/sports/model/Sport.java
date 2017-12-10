package com.jeet.sports.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SPORT")
public class Sport {
	@Id
	private String sportId;
	
	@Column(name="SPORT_NAME",scale=20)
	private String sportName;
	
	@Column(name="CATEGORY_ID")
	private String categoryId;

	public Sport() {
	}

	public Sport(String sportId) {
		this.sportId = sportId;
	}

	public String getSportId() {
		return sportId;
	}

	public void setSportId(String sportId) {
		this.sportId = sportId;
	}

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "Sports [sportId=" + sportId + ", sportName=" + sportName
				+ ", categoryId=" + categoryId + "]";
	}

}
