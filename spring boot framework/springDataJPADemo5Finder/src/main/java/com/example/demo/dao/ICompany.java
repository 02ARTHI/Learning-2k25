package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Company;

@Repository
public interface ICompany extends JpaRepository<Company, Integer> {
   public List<Company> findByName(String name);
   public List<Company> findByStrength(int num);
   public List<Company> findByYearsOld(int num);
   public List<Company> findByNameIs(String name);
   public List<Company> findByNameEquals(String name);
   public List<Company> findByYearsOldLessThan(int num);
   public List<Company> findByYearsOldBetween(int num, int num1);
   public List<Company> findByYearsOldInAndStrengthBetween(List<Integer> nums,int num, int num2);
}
