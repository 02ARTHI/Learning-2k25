package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.TouristNotFoundException;
import com.example.demo.model.Tourist;
import com.example.demo.service.ITouristService;

@RestController
public class TouristController {

	@Autowired
	private ITouristService service;
	
	@PostMapping("/register")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist)
	{
		try
		{
		String msg = service.register(tourist);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<String>("something went wrong while updating tourist",HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/get")
	public ResponseEntity<?> getTourist()
	{
		try
		{
		 List<Tourist> list = service.getAll();
		return new ResponseEntity<List>(list,HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<String>("something went wrong while fetching tourist",HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/getid/{id}")
	public ResponseEntity<?> getTouristById(@PathVariable("id") int id)
	{
		try
		{
		 Tourist obj = service.getbyID(id);
		return new ResponseEntity<>(obj,HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<String>("something went wrong while fetching tourist",HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("update")
	public ResponseEntity<String> updateTourist(@RequestBody Tourist tour)
	{
		try
		{
		 String msg=service.updateInfo(tour);
		return new ResponseEntity<>(msg,HttpStatus.OK);
		}
		catch(TouristNotFoundException e)
		{
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@PatchMapping("updateInfo/{id}/{price}")
	public ResponseEntity<String> updateTourist(@PathVariable("id") int id, Double price)
	{
		try
		{
		 String msg=service.update(id,price);
		return new ResponseEntity<>(msg,HttpStatus.OK);
		}
		catch(TouristNotFoundException e)
		{
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deleteTourist(@PathVariable("id") int id)
	{
		try
		{
		 String msg=service.deleteById(id);
		return new ResponseEntity<>(msg,HttpStatus.OK);
		}
		catch(TouristNotFoundException e)
		{
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
}
