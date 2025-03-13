package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.TouristNotFoundException;
import com.example.demo.model.Tourist;
import com.example.demo.repo.ITouristRepo;

@Service
public class TouristServiceImpl implements ITouristService {

	
	@Autowired
	private ITouristRepo repo;

	@Override
	public String register(Tourist tour)
	{
		int id = repo.save(tour).getId();
		System.out.println(id);
		return "data got saved with id "+id;
	}

	@Override
	public List<Tourist> getAll() {
		
		return repo.findAll();
	}

	@Override
	public Tourist getbyID(int id) {
		
		 Optional<Tourist> byId = repo.findById(id);
		 return byId.get();
	}

	@Override
	public String updateInfo(Tourist tour) {
		
		int id = tour.getId();
		Optional<Tourist> id2 = repo.findById(id);
		if(id2.isPresent())
		{
			repo.save(tour);
			return "tourist id got updated";
		}
		else
		{
			throw new TouristNotFoundException("tourist with give id not found "+id);
		}
	}

	@Override
	public String update(int id, Double price) {
		
		Optional<Tourist> id2 = repo.findById(id);
		if(id2.isPresent())
		{
			Tourist tour= id2.get();
			tour.setPrice(price);
			repo.save(tour);
			return "tourist id got updated";
		}
		else
		{
			throw new TouristNotFoundException("tourist with give id not found "+id);
		}
	}

	@Override
	public String deleteById(int id) {
		
		Optional<Tourist> id2 = repo.findById(id);
		if(id2.isPresent())
		{
			repo.deleteById(id);
			return "tourist id got deleted";
		}
		else
		{
			throw new TouristNotFoundException("tourist with give id not found "+id);
		}
	}
}
