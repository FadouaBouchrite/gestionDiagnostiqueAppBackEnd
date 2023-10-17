package com.example.backenddev.service;

import com.example.backenddev.model.User;

import java.util.List;

public interface UserService {
	
    List<User> getAllUser();
    void deleteuserByid(Long id );
    User getUser(Long id);
    User updateUser(User p);
    User saveUser(User u);
    User login(String email, String password);
    int getScore(Long id);
}
