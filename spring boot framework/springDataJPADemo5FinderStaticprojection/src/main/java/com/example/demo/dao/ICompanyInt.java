package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Company;
import com.example.demo.view.ResultView;

public interface ICompanyInt {
 
	public List<ResultView> fetchName(String n);
	public List<ResultView> fetchStrength(int n);
}
