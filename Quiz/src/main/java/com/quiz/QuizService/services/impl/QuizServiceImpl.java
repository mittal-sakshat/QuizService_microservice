package com.quiz.QuizService.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.QuizService.entities.Quiz;
import com.quiz.QuizService.repositories.QuizRepository;
import com.quiz.QuizService.services.QuizService;

@Service
public class QuizServiceImpl implements QuizService{

	private QuizRepository quizRepository;
	

	public QuizServiceImpl(QuizRepository quizRepository) {
		this.quizRepository = quizRepository;
	}

	@Override
	public Quiz add(Quiz quiz) {
		// TODO Auto-generated method stub
		return quizRepository.save(quiz);
	}

	@Override
	public List<Quiz> get() {
		// TODO Auto-generated method stub
		return quizRepository.findAll();
	}

	@Override
	public Quiz get(Long id) {
		// TODO Auto-generated method stub
		return quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found!"));
	}
	
}
