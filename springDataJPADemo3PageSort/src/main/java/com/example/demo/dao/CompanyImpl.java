package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Company;

@Service
public class CompanyImpl implements ICompanyInt {

	@Autowired
	private ICompany repo;
	
	
}
