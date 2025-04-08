package com.example.LibraryManagementSystemAssociation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String author;
	private String title;
	private Boolean borrowed;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User borrowedBy;

	public Book(Long id, String author, String title, Boolean borrowed, User borrowedBy) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.borrowed = borrowed;
		this.borrowedBy = borrowedBy;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getBorrowed() {
		return borrowed;
	}

	public void setBorrowed(Boolean borrowed) {
		this.borrowed = borrowed;
	}

	public User getBorrowedBy() {
		return borrowedBy;
	}

	public void setBorrowedBy(User borrowedBy) {
		this.borrowedBy = borrowedBy;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", title=" + title + ", borrowed=" + borrowed + ", borrowedBy="
				+ borrowedBy + "]";
	}
	
	
}
