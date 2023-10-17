package com.example.backenddev.service;

import com.example.backenddev.model.Question;
import com.example.backenddev.model.User;
import com.example.backenddev.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImplimentation  implements  QuestionService{
@Autowired
private QuestionRepository questionRepository;

    @Override
    public List<Question> getAllQuestion() {
        return questionRepository.findAll();
    }

    @Override
    public void deleteQuestionByid(Long id) {
  questionRepository.deleteById(id);
    }

    @Override
    public Question getQuestion(Long id) {
        return  questionRepository.findById(id).get();
    }

    @Override
    public Question saveQuestion(Question Q) {
        return questionRepository.save(Q);
    }

}
