package com.Question.Repository;

import com.Question.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question ,Long> {

    List<Question> findByQuizId(Long quizId);
}
