package com.example.backenddev.model;

import jakarta.persistence.*;


@Entity
@Table(name = "reponse")
public class Reponse {


    public Reponse(String response) {
        this.response = response;
    }

    public Reponse() {
    }


    public Long getId_reponse() {
        return id_reponse;
    }

    public void setId_reponse(Long id_reponse) {
        this.id_reponse = id_reponse;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_reponse ;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @Column(name = "response")
    private String response;
}
