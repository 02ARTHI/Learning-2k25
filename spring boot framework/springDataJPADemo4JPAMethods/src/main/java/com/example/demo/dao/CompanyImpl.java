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
	public List<Company> findByJpa(Company com, Boolean status, String... properties) {
		Sort sort=Sort.by(status? Direction.ASC:Direction.DESC, properties);
		Example<Company> example = Example.of(com);
		return repo.findAll(example, sort);
		
	}

	
	
}
