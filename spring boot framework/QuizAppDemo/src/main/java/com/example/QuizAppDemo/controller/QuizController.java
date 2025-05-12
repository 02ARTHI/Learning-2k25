package com.example.QuizAppDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.QuizAppDemo.QuizAppDemoApplication;
import com.example.QuizAppDemo.model.Quiz;
import com.example.QuizAppDemo.service.QuizService;

@RestController
@RequestMapping("questions")
public class QuizController {

	@Autowired
	private QuizService service;
	
	@GetMapping("getAll")
	public ResponseEntity<?> getAllQuestions()
	{
		return service.getAllQuestions();
	}
	
	@GetMapping("category/{cat}")
	public ResponseEntity<?> getquestionsBYCategory(@PathVariable("cat") String cat)
	{
		return service.getQuestByCateory(cat);
	}
	
	@PostMapping("add")
	public ResponseEntity<String> addProduct(@RequestBody Quiz quiz)
	{
		return service.addProduct(quiz);
	}
	
}
