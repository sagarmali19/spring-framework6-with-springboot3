package com.sagar.quiz_service.service;

import com.sagar.quiz_service.model.QuestionWrapper;
import com.sagar.quiz_service.model.Quiz;
import com.sagar.quiz_service.model.Response;
import com.sagar.quiz_service.repository.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    private QuizRepo quizRepo;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        // call generate URL - REST template to send request to other server - http://localhost:8080/questions/generate
        List<Integer> questions =

        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(int id) {
//        Optional<Quiz> quiz = quizRepo.findById(id);
//        List<Question> questionsFromDB = quiz.get().getQuestionList();
        List<QuestionWrapper> questionsForUser = new ArrayList<>();
//        for(Question q : questionsFromDB){
//            QuestionWrapper questionWrapper = new QuestionWrapper(q.getId(), q.getQuestionTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
//            questionsForUser.add(questionWrapper);
//        }
        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateResult(int id, List<Response> reponses) {
        Quiz quiz = quizRepo.findById(id).get();
        List<Question> questionList = quiz.getQuestionList();
        int right = 0;
        int i = 0;
        for(Response response : reponses){
            if(response.getResponse().equals(questionList.get(i).getRightAnswer()))
                right++;
            i++;
        }
        return new ResponseEntity<>(right, HttpStatus.OK);
    }
}
