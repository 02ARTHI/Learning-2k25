package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Company;


@Service
public class CompanyImpl implements ICompanyInt {

	@Autowired
	private ICompany repo;

	@Override
	public List<Company> fetchByName(String name) {
		
		return repo.findByName(name);
	}

	@Override
	public List<Company> fetchByStrength(int num) {
		// TODO Auto-generated method stub
		return repo.findByStrength(num);
	}

	@Override
	public List<Company> fetchByYearsOld(int num) {
		// TODO Auto-generated method stub
		return repo.findByYearsOld(num);
	}

	@Override
	public List<Company> fetchByNameIs(String name) {
		// TODO Auto-generated method stub
		return repo.findByNameIs(name);
	}

	@Override
	public List<Company> fetchByNameEquals(String name) {
		// TODO Auto-generated method stub
		return repo.findByNameEquals(name);
	}

	@Override
	public List<Company> fetchByYearsOldLessThan(int num) {
		// TODO Auto-generated method stub
		return repo.findByYearsOldLessThan(num);
	}

	@Override
	public List<Company> fetchByYearsOldBetween(int num, int num1) {
		// TODO Auto-generated method stub
		return repo.findByYearsOldBetween(num,num1);
	}

	@Override
	public List<Company> fetchByYearsOldInAndStrengthBetween(List<Integer> nums,int num,int num2) {
		// TODO Auto-generated method stub
		return repo.findByYearsOldInAndStrengthBetween(nums, num, num2);
	}


	
}
