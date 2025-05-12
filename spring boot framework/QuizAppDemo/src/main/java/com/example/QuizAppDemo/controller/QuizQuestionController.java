package com.example.QuizAppDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.QuizAppDemo.service.QuizQuestionService;

@RestController
@RequestMapping("quiz")
public class QuizQuestionController {
	
	@Autowired
	private QuizQuestionService service;

	@GetMapping("create")
	public ResponseEntity<?> getAllQuestions(@RequestParam String category, @RequestParam String title,@RequestParam int numq )
	{
		return service.createQuiz(category, numq,title);
	}
	
	@GetMapping("get/{id}")
	public ResponseEntity<?> getQuiz(@PathVariable int id)
	{
		return service.getQuiz(id);
	}
}
