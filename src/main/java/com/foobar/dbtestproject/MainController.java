package com.foobar.dbtestproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	
	@RequestMapping("/save")
	public String save() {
		Book book1 = new Book("1", "El Quijote");
		Book book2 = new Book("2", "La Celestinaa");
		bookRepository.save(book1);
		bookRepository.save(book2);
		Category cat1 = new Category("1", "Categoría 1");
		categoryRepository.save(cat1);
		Category cat2 = new Category("2", "Categoría 2");
		categoryRepository.save(cat1);
		List<Category> catList = new ArrayList<Category>();
		catList.add(cat1);
		catList.add(cat2);
		book1.setCategories(catList);
		bookRepository.save(book1);
		return "";
	}
	
	@RequestMapping("/get/{id}")
	public Book get(@PathVariable("id") String id ) {
		return bookRepository.findOne(Long.valueOf(id));
	}
}
