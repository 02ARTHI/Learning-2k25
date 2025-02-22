package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Iterable<Company> sorting(Boolean status, String... properties) {
		Sort sort= Sort.by(status?Direction.ASC:Direction.DESC, properties);
		return repo.findAll(sort);
	}

	@Override
	public Iterable<Company> sorting(int pgno, int pagsize, Boolean status, String... properties) {
		// TODO Auto-generated method stub
		PageRequest pr = PageRequest.of(pgno, pagsize, status?Direction.ASC:Direction.DESC, properties);
		return repo.findAll(pr);
	}
	
	
}
