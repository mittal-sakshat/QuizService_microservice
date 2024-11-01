package com.quiz.QuizService.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {
	
	private Long id;
	private String name;
	private Long quizId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getQuizId() {
		return quizId;
	}
	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}
	public Question() {
		
	}
	
	
	
	public Question(Long id, String name, Long quizId) {
		super();
		this.id = id;
		this.name = name;
		this.quizId = quizId;
	}
	
	
}
