package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Company;

@Repository
public interface ICompany extends PagingAndSortingRepository<Company, Integer> {

}
