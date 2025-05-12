package com.example.QuizAppDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.QuizAppDemo.model.Quiz;
import com.example.QuizAppDemo.repo.IQuizRepo;

@Service
public class QuizService {
	
	@Autowired
	private IQuizRepo repo;

	public ResponseEntity<?> getAllQuestions() {
		try
		{
		return new ResponseEntity<List<Quiz>>(repo.findAll(),HttpStatus.FOUND);
		}
		catch( Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<String>("no list available",HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<?> getQuestByCateory(String cat) {
		// TODO Auto-generated method stub
		try
		{
		return new ResponseEntity<List<Quiz>>(repo.findByCategory(cat),HttpStatus.FOUND);
		}
		catch( Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<String>("no list available",HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<String> addProduct(Quiz quiz) {
		try
		{
		 Quiz save = repo.save(quiz);
		 int id=save.getId();
		 return new ResponseEntity<String>("product with id "+id+" got saved",HttpStatus.CREATED);
	}
	catch( Exception e)
	{
		e.printStackTrace();
	}
				 
		return new ResponseEntity<String>("no list available",HttpStatus.BAD_REQUEST);	 
	}

}
