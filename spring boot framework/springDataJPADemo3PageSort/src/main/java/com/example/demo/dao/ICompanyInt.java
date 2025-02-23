package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Company;

public interface ICompanyInt {
 
	 public Iterable<Company> sorting(Boolean status, String...properties);
	 public Iterable<Company> sorting(int pgno, int pagsize,Boolean status, String...properties);
	 public void pagination(int pgsize);
}
