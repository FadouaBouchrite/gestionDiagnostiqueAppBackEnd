package com.example.backenddev.service;

import com.example.backenddev.model.Diagonstic;
import com.example.backenddev.model.Question;
import com.example.backenddev.model.Reponse;
import com.example.backenddev.model.User;
import com.example.backenddev.repository.DiagnosticRepository;
import com.example.backenddev.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserServiceImplimentation implements  UserService{
@Autowired
    UserRepository userRepository;
@Autowired
ReponseService reponseService;
@Autowired
     DiagnosticRepository diagnosticRepository;
@Autowired
QuestionService questionService;
    @Override
    public List<User> getAllUser() {

        return userRepository.findAll() ;
    }
    @Override
    public User login(String email, String password) {

        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {

            return user;
        }
        return null; // L'utilisateur n'a pas pu être authentifié
    }



    @Override
    public void deleteuserByid(Long id) {
       userRepository.deleteById(id);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User updateUser(User p) {
        return userRepository.save(p);
    }

    @Override
    public User saveUser(User U  ) {
         Diagonstic k= new Diagonstic();
        diagnosticRepository.save(k);
        return userRepository.save(U);
    }
    @Override
    public int getScore(Long id) {
        int score=0;
        int nombre_qst=0;



        List<Reponse> reponses = reponseService.getAllReponse();

        for (Reponse reponse:reponses){
            if(reponse.getUser().getId()==id ){
                nombre_qst=nombre_qst+1;

                List<Question> questions = questionService.getAllQuestion();
                for ( Question question : questions){
                    if (reponse.getQuestion().getId_qst()==question.getId_qst() && reponse.getResponse().equals(question.getCon_vraie())){
                        score++;
                    }
                }


            }
        }

        return score*100/nombre_qst;}

    
            }



