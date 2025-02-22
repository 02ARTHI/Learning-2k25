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

	@Override
	public String removeCompanyBYIds(List<Integer> ids) {
		List<Company> id=(List<Company>)repo.findAllById(ids);
		if(ids.size() == id.size())
		{
			repo.deleteAllById(ids);
			return "given ids got deleted";
		}
		return "Given ids not got deleted";
	}

	@Override
	public String removeBYObject(Company com) {
		Optional<Company> id = repo.findById(com.getId());
		if(id.isPresent())
		{
			repo.delete(com);
			return "company object got deleted";
		}
		return "company object not found";
	}
}
