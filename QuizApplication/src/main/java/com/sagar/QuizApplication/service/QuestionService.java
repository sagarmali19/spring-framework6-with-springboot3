package com.sagar.QuizApplication.service;

import com.sagar.QuizApplication.model.Question;
import com.sagar.QuizApplication.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo questionRepo;

    public List<Question> getAllQuestions() {
        return questionRepo.findAll();
    }

    public List<Question> getQuestionByCategory(String category) {
        return questionRepo.findByCategory(category);
    }

    public Question addQuetion(Question question) {
        return questionRepo.save(question);
    }
}
