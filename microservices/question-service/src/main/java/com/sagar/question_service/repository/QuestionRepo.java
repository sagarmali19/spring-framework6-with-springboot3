package com.sagar.question_service.repository;

import com.sagar.question_service.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {
    List<Question> findByCategory(String category);

    @Query(value="SELECT q.id FROM question q WHERE q.category=:category ORDER BY RANDOM() LIMIT :numQuestions")
    List<Integer> findRandomQuestionsByCategory(String categoryName, Integer numQuestions);
}
