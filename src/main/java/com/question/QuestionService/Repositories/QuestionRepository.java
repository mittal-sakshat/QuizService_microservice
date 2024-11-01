package com.question.QuestionService.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.question.QuestionService.entities.Questions;


public interface QuestionRepository extends JpaRepository<Questions, Long> {
	
	List<Questions> findByQuizId(Long quizId);
}
