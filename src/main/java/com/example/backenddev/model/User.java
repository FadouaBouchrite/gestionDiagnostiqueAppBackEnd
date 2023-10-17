package com.example.backenddev.model;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id_user ;

    public User(String name, String email, String username, String password) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    private  String name;
    private String email     ;
    private  String username ;
    private  String password ;


  


    public User(Long id, String name, String email, String username, String password) {
        this.id_user = id;
        this.name= name;
        this.email = email;
        this.username = username;
        this.password = password;
    }




    public Long getId() {
        return id_user;
    }

    public void setId(Long id) {
        this.id_user= id;
    }

    public String getName() {
        return name;
    }

    public void setNomGirant(String nomGirant) {
        this.name = nomGirant;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public  User ( String email , String password){
        this.email=email;
        this.password=password;
    }



}
