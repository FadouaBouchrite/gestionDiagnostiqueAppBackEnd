package com.example.backenddev.controller;

import com.example.backenddev.model.Reponse;
import com.example.backenddev.model.User;
import com.example.backenddev.service.ReponseService;
import com.example.backenddev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/reponse")
public class ReponseController {
    @Autowired
    private ReponseService reponseService;

    @GetMapping("/list/{id}")
    public Reponse getResponse(@PathVariable Long id){
        return reponseService.getReponse(id);
    }
    @PostMapping("/add")
    public  Reponse saveReponse(@RequestBody Reponse R){
        return  reponseService.saveReponse(R);
    }
    @DeleteMapping("/delete/{id}")
    public  void deleteById(@PathVariable Long id){
        reponseService.deleteReponseByid(id);
    }
    @GetMapping("/getallReponse")
    public List<Reponse> getList(){
        return  reponseService.getAllReponse() ;
    }
    //ajouter
    @PostMapping("/setallReponse")
    public void setList(@RequestBody List<Reponse> R){
        reponseService.saveAll(R) ;
    }




}
