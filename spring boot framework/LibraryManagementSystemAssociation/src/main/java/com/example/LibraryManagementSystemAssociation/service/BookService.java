package com.example.LibraryManagementSystemAssociation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.LibraryManagementSystemAssociation.model.User;
import com.example.LibraryManagementSystemAssociation.model.Book;
import com.example.LibraryManagementSystemAssociation.repo.IBookRepo;
import com.example.LibraryManagementSystemAssociation.repo.IUserRepo;

@Service
public class BookService {

	@Autowired
	private IBookRepo repo;
	
	@Autowired
	private IUserRepo repo1;
	
	
	public List<Book> getAllBooks()
	{
		return repo.findAll();
	}
	
	public Book FindByIDBook(Long id)
	{
		return repo.findById(id).get();
	}
	
	public Book save(Book book)
	{
		return repo.save(book);
	}
	
	public void deleteById(Long id)
	{
		 repo.deleteById(id);
	}
	
	public Book BorrowBook(Long id, Long userId)
	{
		Book book = repo.findById(id).get();
		User user=repo1.findById(userId).get();
		
		if(book != null && user !=null && !book.getBorrowed())
		{
			book.setBorrowedBy(user);
			book.setBorrowed(true);
			return repo.save(book);
		}
		// Handle errors (e.g., book not found, book already borrowed, user not found)
		return null;
		
	}
	
	public Book returnBook(Long id)
	{
		
		Book book =repo.findById(id).get();
		if(book !=null && book.getBorrowed())
		{
			book.setBorrowed(false);
			book.setBorrowedBy(null);
			return repo.save(book);
		}
		
		return null;
	}
}
