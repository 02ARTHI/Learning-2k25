package com.example.QuizAppDemo.model;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class QuizQuestion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	
	@ManyToMany
	private List<Quiz> questions;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Quiz> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Quiz> questions) {
		this.questions = questions;
	}

	public QuizQuestion(int id, String title, List<Quiz> questions) {
		super();
		this.id = id;
		this.title = title;
		this.questions = questions;
	}

	public QuizQuestion() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "QuizQuestion [id=" + id + ", title=" + title + ", questions=" + questions + "]";
	}
	
	
}
