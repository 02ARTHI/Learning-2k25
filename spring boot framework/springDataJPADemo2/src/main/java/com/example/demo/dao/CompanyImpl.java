package com.example.demo.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Company;

@Service
public class CompanyImpl implements ICompanyInt {

	@Autowired
	private ICompany repo;
	
	@Override
	public Company register(Company obj) {
		  
		return repo.save(obj);
	}

	@Override
	public Iterable<Company> getAllList(Iterable<Company> ls) {
		
		return repo.saveAll(ls);
	}

	@Override
	public long count() {
		
		return repo.count();
	
	}

	@Override
	public Boolean existsCom(int id) {
		
		return repo.existsById(id);
	}

	@Override
	public Iterable<Company> getall() {


		return repo.findAll();
	}

	@Override
	public Iterable<Company> getallByID(Iterable<Integer> ids) {
		
		return repo.findAllById(ids);
	}

	@Override
	public Optional<Company> getCompanyBYId(int id) {
		
		return repo.findById(id);
	}

	@Override
	public String removeById(int id) {
		 Optional<Company> opt = repo.findById(id);
		 if(opt.isPresent())
		 {
			repo.deleteById(id);
			return "ID : " + id+ " got deleted from table";
		 }
		 return "ID : " + id+ " not found in table";
	}
}
