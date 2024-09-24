package com.Question.Service;

import com.Question.Entity.Question;

import java.util.List;

public interface QuestionService {

    Question add(Question question);

    List<Question> getAll();

    Question getById(Long id);

    // custom method to find question from quiz id
    List<Question> getQuestionsOfQuiz(Long id);
}
