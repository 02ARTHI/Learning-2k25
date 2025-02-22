package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Company;

public interface ICompanyInt {
 
	 public Company register(Company obj);
	 public Iterable<Company> getAllList(Iterable<Company> ls);
	 public long count();
	 public Boolean existsCom(int id);
	 public Iterable<Company> getall();
	 public Iterable<Company> getallByID(Iterable<Integer> ids);
	 public Optional<Company> getCompanyBYId(int id);
	 public String removeById(int id);
	 public String removeCompanyBYIds(List<Integer> ids);
	 public String removeBYObject(Company com);
	 //public   
}
