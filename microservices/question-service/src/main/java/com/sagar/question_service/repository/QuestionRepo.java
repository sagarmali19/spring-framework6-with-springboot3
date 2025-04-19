package com.sagar.question_service.repository;

import com.sagar.question_service.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {
    List<Question> findByCategory(String category);

    @Query(value = "SELECT * FROM question WHERE category = :category ORDER BY RANDOM()", nativeQuery = true)
    List<Integer> findRandomQuestionsByCategory(String categoryName, Integer numQuestions);
}
