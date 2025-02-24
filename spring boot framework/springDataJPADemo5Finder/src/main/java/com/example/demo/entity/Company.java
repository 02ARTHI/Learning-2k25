package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Company {

	@Id
	private int id;
	private String name;
	private int strength;
	private int yearsOld;
	public Company(int id, String name, int strength, int yearsOld) {
		super();
		this.id = id;
		this.name = name;
		this.strength = strength;
		this.yearsOld = yearsOld;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getYearsOld() {
		return yearsOld;
	}
	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", strength=" + strength + ", yearsOld=" + yearsOld + "]";
	}
	
	
}
