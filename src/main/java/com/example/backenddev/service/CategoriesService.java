package com.example.backenddev.service;

import com.example.backenddev.model.Categories;
import com.example.backenddev.model.Question;

import java.util.List;

public interface CategoriesService {
    List<Categories> getAllCategories();
    void deleteCategoriesByid(Long id );
    Categories getCategories(Long id);
    Categories saveCategories(Categories C);
}
