package com.question.QuestionService.Controller;

import java.util.List;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.QuestionService.Service.QuestionService;
import com.question.QuestionService.entities.Questions;

@RestController
@RequestMapping("/question")
public class QuestionController {
	
	private QuestionService questionService;

	public QuestionController(QuestionService questionService) {
		super();
		this.questionService = questionService;
	}
	
	@PostMapping
	public Questions create(@RequestBody Questions questions) {
		return questionService.create(questions);
	}
	
	@GetMapping
	public List<Questions> getAll(){
		return questionService.get();
	}
	
	@GetMapping("/{questionId}")
	public Questions getQuestions(@PathVariable Long questionId) {
		return questionService.getOne(questionId);
	}
	
	@GetMapping("/{quizId}")
	public List<Questions> getQuestionsOfQuiz(@PathVariable Long quizId){
		return questionService.getQuestionsOfQuiz(quizId);
	}
}
