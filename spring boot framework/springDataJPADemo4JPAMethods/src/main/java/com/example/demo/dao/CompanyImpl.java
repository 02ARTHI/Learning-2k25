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

	@Override
	public Company searchById(int id) {
		Company referenceById = repo.getReferenceById(id);
		return referenceById;
		//repo.findAll()
	}

	@Override
	public List<Company> searchByIdObject(Company com) {
		Example exmaple = Example.of(com);
		return repo.findAll(exmaple);
		
	}

	@Override
	public String removeIdBYBatch(List<Integer> ids) {
		
		List<Company> id = repo.findAllById(ids);
		System.out.println("size of id: "+id.size());
		System.out.println("size of ids: "+ids.size());
		
		if(id.size()==ids.size())
		{
			repo.deleteAllByIdInBatch(ids);
			return "ids got deleted";
		}
		 
		return "ids not deleted";
	}

	
	
}
