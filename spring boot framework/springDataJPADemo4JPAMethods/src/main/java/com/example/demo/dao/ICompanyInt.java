package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Company;

public interface ICompanyInt {
 
	 public List<Company> findByJpa(Company com,Boolean status, String...properties);
}
