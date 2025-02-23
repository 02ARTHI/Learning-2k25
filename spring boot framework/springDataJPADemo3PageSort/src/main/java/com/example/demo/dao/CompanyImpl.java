package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Override
	public void pagination(int pgsize) {
		Long count=2L;
		Long pg=count/pgsize;
		pg=(count%pgsize==0)?pg:++pg;
		for(int i=0;i<pg;i++)
		{
			PageRequest pageable = PageRequest.of(i, pgsize);
			Page<Company> page = repo.findAll(pageable);
			System.out.println("page number " +i);
			page.getContent().forEach(c-> System.out.println(c));
			System.out.println("-------------");
		}
		
	}
	
	
}
