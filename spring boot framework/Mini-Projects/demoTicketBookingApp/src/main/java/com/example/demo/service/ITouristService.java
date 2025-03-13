package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Tourist;
import com.example.demo.repo.ITouristRepo;

public interface ITouristService {
	


	public String register(Tourist tour);
	public List<Tourist> getAll();
	public Tourist getbyID(int id);
	public String updateInfo(Tourist tour);
	public String update(int id, Double price);
	public String deleteById(int id);
	
}
