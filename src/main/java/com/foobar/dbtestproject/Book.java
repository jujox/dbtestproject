package com.foobar.dbtestproject;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Book {
	@Id
	private Long id;
	private String title;

	@ManyToMany
	@JoinTable(name = "BOOK_CATEGORIES", 
	joinColumns = @JoinColumn(name = "ID_BOOK", referencedColumnName = "ID"), 
	inverseJoinColumns = @JoinColumn(name = "ID_CATEGORY", referencedColumnName = "ID"))
	private List<Category> categories;

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public Book() {
	}

	public Book(String id, String title) {
		this.id = Long.valueOf(id);
		;
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
