package com.example.LibraryManagementSystemAssociation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LibraryManagementSystemAssociation.model.Book;

public interface IBookRepo extends JpaRepository<Book, Long> {

}
