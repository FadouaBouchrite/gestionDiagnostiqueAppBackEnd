package com.example.backenddev.service;

import com.example.backenddev.model.Diagonstic;
import com.example.backenddev.repository.DiagnosticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;
@Service
public class DiagnosticServiceImplimentation implements  DiagnosticService {
    @Autowired
    DiagnosticRepository diagnosticRepository;
    @Override
    public List<Diagonstic> getAllDiagnostic() {
        return diagnosticRepository.findAll();
    }

    @Override
    public void deleteDiagnosticByid(Long id) {
     diagnosticRepository.deleteById(id);
    }

    @Override
    public Diagonstic getDiagnostic(Long id) {
        return diagnosticRepository.findById(id).get();
    }

    @Override
    public Diagonstic saveDiagnostic(Diagonstic D) {
        return diagnosticRepository.save(D);
    }
}
