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
import com.example.demo.view.ResultView;


@Service
public class CompanyImpl implements ICompanyInt {

	@Autowired
	private ICompany repo;

	@Override
	public List<ResultView> fetchName(String n) {
	
		return repo.findByName(n);
	}

	@Override
	public List<ResultView> fetchStrength(int n) {
		// TODO Auto-generated method stub
		return repo.findByStrength(n);
	}

	
}
