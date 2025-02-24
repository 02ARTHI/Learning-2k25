package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Company;

public interface ICompanyInt {
 
	 public List<Company> findByJpa(Company com,Boolean status, String...properties);
	 public Company searchById(int id);
	 public List<Company> searchByIdObject(Company com);
	 public String removeIdBYBatch(List<Integer> ids);
}
