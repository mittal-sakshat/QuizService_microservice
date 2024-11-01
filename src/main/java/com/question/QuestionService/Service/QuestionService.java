package com.question.QuestionService.Service;

import java.util.List;



import com.question.QuestionService.entities.Questions;


public interface QuestionService {
	Questions create(Questions question);
    List<Questions> get();
    Questions getOne(Long id);

    List<Questions> getQuestionsOfQuiz(Long quizId);
}
