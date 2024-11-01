package com.quiz.QuizService.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.quiz.QuizService.entities.Quiz;
import com.quiz.QuizService.repositories.QuizRepository;
import com.quiz.QuizService.services.QuestionClient;
import com.quiz.QuizService.services.QuizService;

@Service
public class QuizServiceImpl implements QuizService{

	private QuizRepository quizRepository;
	private QuestionClient questionClient;
	
	

	public QuizServiceImpl(QuizRepository quizRepository, QuestionClient questionClient) {
		super();
		this.quizRepository = quizRepository;
		this.questionClient = questionClient;
	}

	@Override
	public Quiz add(Quiz quiz) {
		// TODO Auto-generated method stub
		return quizRepository.save(quiz);
	}

	@Override
	public List<Quiz> get() {
		// TODO Auto-generated method stub
		List<Quiz> quiz = quizRepository.findAll();
		List<Quiz> newQuizList = quiz.stream().map(quiz1 -> {
			quiz1.setQuestionList(questionClient.getQuestionOfQuiz(quiz1.getId()));
			return quiz1;
		}).collect(Collectors.toList());
		return newQuizList;
	}

	@Override
	public Quiz get(Long id) {
		// TODO Auto-generated method stub
		Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("No quiz with this id exists."));
		quiz.setQuestionList(questionClient.getQuestionOfQuiz(quiz.getId()));
		return quiz;
	}
	
	
	
}
