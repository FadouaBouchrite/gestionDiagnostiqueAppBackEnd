package com.example.backenddev.service;


import com.example.backenddev.model.Question;


import java.util.List;

public interface QuestionService {
    List<Question> getAllQuestion();
    void deleteQuestionByid(Long id );
    Question getQuestion(Long id);
    Question saveQuestion(Question Q);
}
