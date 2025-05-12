package com.example.QuizAppDemo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.QuizAppDemo.model.Quiz;


@Repository
public interface IQuizRepo extends JpaRepository<Quiz, Integer> {

	List<Quiz> findByCategory(String cat);

	@Query(value="SELECT * from questions q WHERE q.category=:category ORDER BY RANDOM() LIMIT :num", nativeQuery=true)
	 List<Quiz> createAQuizWithNumOfQues(String category, int num);

}
