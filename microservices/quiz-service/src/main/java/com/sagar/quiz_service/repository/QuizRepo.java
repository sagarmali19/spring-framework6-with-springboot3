package com.sagar.quiz_service.repository;

import com.sagar.quiz_service.model.Quiz;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepo extends JpaRepository<Quiz, Integer> {
    @Query(value = "SELECT * FROM question WHERE category = :category ORDER BY RANDOM()", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, Pageable pageable);

}
