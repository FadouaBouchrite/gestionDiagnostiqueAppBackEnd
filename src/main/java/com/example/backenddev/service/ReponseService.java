package com.example.backenddev.service;

import com.example.backenddev.model.Reponse;
import com.example.backenddev.model.User;

import java.util.List;

public interface ReponseService {
    List<Reponse> getAllReponse();
    void deleteReponseByid(Long id );
    Reponse getReponse(Long id);
    Reponse saveReponse(Reponse R);
    List<Reponse> getallreponseByid(Long id);
   void saveAll(List <Reponse> R);


}
