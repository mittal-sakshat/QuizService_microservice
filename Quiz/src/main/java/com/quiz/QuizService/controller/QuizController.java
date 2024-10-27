package com.quiz.QuizService.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.QuizService.entities.Quiz;
import com.quiz.QuizService.services.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	private QuizService quizService;

	public QuizController(QuizService quizService) {
		this.quizService = quizService;
	}
	
	
	//create
	@PostMapping
	public Quiz create(@RequestBody Quiz quiz) {
		System.out.println("hewionfiu" + quiz);
		return quizService.add(quiz);
	}
	
	@GetMapping
	public List<Quiz> get(){
		List<Quiz> quizesList = quizService.get();
		for(Quiz quiz : quizesList) {
			System.out.println(quiz);
		}
		return quizesList;
	}
	
	@GetMapping("/{id}")
	public Quiz getOne(@PathVariable Long id) {
		return quizService.get(id);
	}
	
	
}
