package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Company;
import com.example.demo.view.ResultView;

@Repository
public interface ICompany extends JpaRepository<Company, Integer> {

	public List<ResultView> findByName(String n);
	public List<ResultView> findByStrength(int num);
}
