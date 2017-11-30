package com.foobar.dbtestproject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	private Long Id;
	private String catName;

	public Category() {

	}

	public Category(String id, String catName) {
		Id = Long.valueOf(id);
		this.catName = catName;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

}
