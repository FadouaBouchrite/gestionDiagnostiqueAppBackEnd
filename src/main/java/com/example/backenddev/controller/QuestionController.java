package com.example.backenddev.controller;

import com.example.backenddev.model.Question;
import com.example.backenddev.model.User;
import com.example.backenddev.service.QuestionService;
import com.example.backenddev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/question")

public class QuestionController {


    @Autowired
    private QuestionService questionService;

    @GetMapping("/list/{id}")
    public Question getUser(@PathVariable Long id){
        return questionService.getQuestion(id);
    }
    @PostMapping("/add")
    public  Question savequestion(@RequestBody Question Q){
        return  questionService.saveQuestion(Q);
    }

    @DeleteMapping("/delete/{id}")

    public  void deleteById(@PathVariable Long id){
        questionService.deleteQuestionByid(id);
    }
    @GetMapping("/getallquestion")
    public List<Question> getList() {
        return questionService.getAllQuestion();
    }

}
