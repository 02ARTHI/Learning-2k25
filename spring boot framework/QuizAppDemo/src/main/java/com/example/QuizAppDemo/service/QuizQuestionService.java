package com.example.QuizAppDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.QuizAppDemo.model.QuestionWrapper;
import com.example.QuizAppDemo.model.Quiz;
import com.example.QuizAppDemo.model.QuizQuestion;
import com.example.QuizAppDemo.repo.IQuizQuestionRepo;
import com.example.QuizAppDemo.repo.IQuizRepo;

@Service
public class QuizQuestionService {

	@Autowired
	private IQuizQuestionRepo repo;
	
	@Autowired
	private IQuizRepo repo1;
	
	public ResponseEntity<?> createQuiz(String category, int numq, String title) {
		List<Quiz> obj = repo1.createAQuizWithNumOfQues(category,numq);
		QuizQuestion quiz = new QuizQuestion();
		quiz.setTitle(title);
		quiz.setQuestions(obj);
		repo.save(quiz);
		return new ResponseEntity<QuizQuestion>(quiz, HttpStatus.CREATED);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuiz(int id) {
		Optional<QuizQuestion> quiz = repo.findById(id);
		List<Quiz> quesFromDB = quiz.get().getQuestions();
		List<QuestionWrapper> quesForUser = new ArrayList<>();
		for(Quiz q : quesFromDB)
		{
			QuestionWrapper qw = new QuestionWrapper(q.getId(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4(),q.getQuestiontitle());
			quesForUser.add(qw);
		}
		return new ResponseEntity<>(quesForUser,HttpStatus.CREATED);
	}

}
