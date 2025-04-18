package com.sagar.QuizApplication.controller;

import com.sagar.QuizApplication.model.Question;
import com.sagar.QuizApplication.model.QuestionWrapper;
import com.sagar.QuizApplication.model.Response;
import com.sagar.QuizApplication.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ,  @RequestParam String title){
        //return new ResponseEntity<>("I am here", HttpStatus.OK);
        // http://localhost:8080/quiz/create?category=Java&numQ=5&title=JQuiz

        return quizService.createQuiz(category, numQ, title);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable int id){
        return quizService.getQuizQuestion(id);
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable int id, @RequestBody List<Response> reponses){
        return quizService.calculateResult(id, reponses);
    }


}
