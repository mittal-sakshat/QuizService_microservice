package com.question.QuestionService.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.QuestionService.Repositories.QuestionRepository;
import com.question.QuestionService.Service.QuestionService;
import com.question.QuestionService.entities.Questions;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	private QuestionRepository questionRepository;

	public QuestionServiceImpl(QuestionRepository questionRepository) {
		super();
		this.questionRepository = questionRepository;
	}
	
	public List<Questions> get(){
		return questionRepository.findAll();
	}
	
	public Questions create(Questions questions) {
		return questionRepository.save(questions);
		
	}
	
	public Questions getOne(Long id) {
		return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found !!"));
	}
	
	public List<Questions> getQuestionsOfQuiz(Long quizId){
		return questionRepository.findByQuizId(quizId);
	}
	
}
