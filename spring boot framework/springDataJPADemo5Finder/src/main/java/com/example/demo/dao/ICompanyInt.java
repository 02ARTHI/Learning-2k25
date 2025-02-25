package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Company;

public interface ICompanyInt {
 
	 public List<Company> fetchByName(String name);
	   public List<Company> fetchByStrength(int num);
	   public List<Company> fetchByYearsOld(int num);
	   public List<Company> fetchByNameIs(String name);
	   public List<Company> fetchByNameEquals(String name);
	   public List<Company> fetchByYearsOldLessThan(int num);
	   public List<Company> fetchByYearsOldBetween(int num, int num1);
	   public List<Company> fetchByYearsOldInAndStrengthBetween(List<Integer> nums,int num, int num2);
}
