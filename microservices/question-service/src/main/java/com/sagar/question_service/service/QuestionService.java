package com.sagar.question_service.service;

import com.sagar.question_service.model.Question;
import com.sagar.question_service.model.QuestionWrapper;
import com.sagar.question_service.model.Response;
import com.sagar.question_service.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public ResponseEntity<List<Integer>> getQuestionsForQuiz(String categoryName, Integer numQuestions) {
        return  new ResponseEntity<>(questionRepo.findRandomQuestionsByCategory(categoryName, numQuestions), HttpStatus.OK);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Integer> questionIds) {
        List<QuestionWrapper> questionWrappers = new ArrayList<>();
        List<Question> questions = new ArrayList<>();
        for(Integer id : questionIds){
            questions.add(questionRepo.findById(id).get());
        }

        for(Question question : questions){
            QuestionWrapper wrapper = new QuestionWrapper();
            wrapper.setId(question.getId());
            wrapper.setQuestionTitle(question.getQuestionTitle());
            wrapper.setOption1(question.getOption1());
            wrapper.setOption2(question.getOption2());
            wrapper.setOption3(question.getOption3());
            wrapper.setOption4(question.getOption4());
            questionWrappers.add(wrapper);
        }

        return new ResponseEntity<>(questionWrappers, HttpStatus.OK);
    }

    public ResponseEntity<Integer> getScore(List<Response> responses) {
        int right = 0;

        for(Response response : responses){
            Question question = questionRepo.findById(response.getId()).get();
            if(response.getResponse().equals(question.getRightAnswer()))
                right++;
        }

        return new ResponseEntity<>(right, HttpStatus.OK);
    }
}
