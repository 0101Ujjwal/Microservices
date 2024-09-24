package com.Question.Service.Imple;

import com.Question.Entity.Question;
import com.Question.Repository.QuestionRepo;
import com.Question.Service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImplementaion implements QuestionService {
    private QuestionRepo repo;

    public QuestionServiceImplementaion(QuestionRepo repo){
        this.repo = repo;
    }

    @Override
    public Question add(Question question) {
        return repo.save(question);
    }

    @Override
    public List<Question> getAll() {
        return repo.findAll();
    }

    public Question getById(Long id) {
        Optional<Question> optionalQuestion = repo.findById(id);
        return optionalQuestion.orElse(null); // or handle it differently, e.g., throw an exception
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Long id) {
        return repo.findByQuizId(id);
    }
}
