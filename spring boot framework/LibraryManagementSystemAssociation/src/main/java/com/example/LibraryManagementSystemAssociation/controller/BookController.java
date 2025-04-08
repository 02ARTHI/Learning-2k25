package com.example.LibraryManagementSystemAssociation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LibraryManagementSystemAssociation.model.Book;
import com.example.LibraryManagementSystemAssociation.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {

	@Autowired
	private BookService service;
	
	@GetMapping("/get")
	public List<Book> get()
	{
		return service.getAllBooks();
	}
	
	@GetMapping("/byid/{id}")
	public Book FindbyId(@PathVariable("id") Long id)
	{
		return service.FindByIDBook(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id)
	{
		 service.deleteById(id);
	}
	
	@PostMapping("/save")
	public Book saveBook(@RequestBody Book book)
	{
		return service.save(book);
	}
	
	@PutMapping("Borrow/{id}/{UserId}")
	public Book borrowBook(@PathVariable("id") Long id, @PathVariable("UserId") Long UserId)
	{
		return service.BorrowBook(id, UserId);
	}
	
	@PutMapping("return/{id}")
	public Book returnBook(@PathVariable("id") Long id)
	{
		return service.returnBook(id);
	}		
}
