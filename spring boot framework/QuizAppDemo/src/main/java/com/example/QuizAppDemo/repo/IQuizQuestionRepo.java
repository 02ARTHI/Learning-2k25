package com.example.QuizAppDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.QuizAppDemo.model.QuizQuestion;

@Repository
public interface IQuizQuestionRepo extends JpaRepository<QuizQuestion, Integer>{

}
