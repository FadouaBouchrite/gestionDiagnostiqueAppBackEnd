package com.example.backenddev.controller;

import com.example.backenddev.service.DiagnosticService;
import com.example.backenddev.service.DiagnosticServiceImplimentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.backenddev.model.Diagonstic;


import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/diagnostic")
public class DiagnosticController {
    @Autowired
    DiagnosticService diagnosticServiceImplimentation;
    @GetMapping("/list/{id}")
    public Diagonstic getDiagnostic(@PathVariable Long id){
        return diagnosticServiceImplimentation.getDiagnostic(id);
    }
    @PostMapping("/add")
    public Diagonstic saveDiagnostic(@RequestBody Diagonstic D){
        return  diagnosticServiceImplimentation.saveDiagnostic(D);
    }
    @DeleteMapping("/delete/{id}")
    public  void deleteById(@PathVariable Long id){
        diagnosticServiceImplimentation.deleteDiagnosticByid(id);
    }
    @GetMapping("/getallDiagnostics")
    public List<Diagonstic> getList() {
        return diagnosticServiceImplimentation.getAllDiagnostic();
    }
}
