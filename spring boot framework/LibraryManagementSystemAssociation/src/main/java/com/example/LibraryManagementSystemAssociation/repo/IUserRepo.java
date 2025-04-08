package com.example.LibraryManagementSystemAssociation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LibraryManagementSystemAssociation.model.User;

public interface IUserRepo extends JpaRepository<User, Long> {

}
