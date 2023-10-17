package com.example.backenddev.controller;

import com.example.backenddev.model.Categories;
import com.example.backenddev.model.Question;
import com.example.backenddev.service.CategoriesService;
import com.example.backenddev.service.CategoriesServiceImplimentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/categories")
public class CategoriesController {
    @Autowired
    CategoriesService categoriesServiceImplimentation;
    @GetMapping("/list/{id}")
    public Categories getCategorie(@PathVariable Long id){
        return categoriesServiceImplimentation.getCategories(id);
    }
    @PostMapping("/add")
    public  Categories saveCategorie(@RequestBody Categories C){
        return  categoriesServiceImplimentation.saveCategories(C);
    }
    @DeleteMapping("/delete/{id}")
    public  void deleteById(@PathVariable Long id){
        categoriesServiceImplimentation.deleteCategoriesByid(id);
    }


    @GetMapping("/getallCategories")
    public List<Categories> getList() {
        return categoriesServiceImplimentation.getAllCategories();
    }
}
