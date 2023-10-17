package com.example.backenddev.service;

import com.example.backenddev.model.Categories;
import com.example.backenddev.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoriesServiceImplimentation  implements  CategoriesService{
    @Autowired
    CategoriesRepository categoriesRepository;
    @Override
    public List<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }

    @Override
    public void deleteCategoriesByid(Long id) {
categoriesRepository.deleteById(id);
    }

    @Override
    public Categories getCategories(Long id) {
        return categoriesRepository.findById(id).get();
    }

    @Override
    public Categories saveCategories(Categories C) {
        return  categoriesRepository.save(C);
    }
}
