package com.example.backenddev.service;

import com.example.backenddev.model.Diagonstic;


import java.util.List;

public interface DiagnosticService {
    List<Diagonstic> getAllDiagnostic();
    void deleteDiagnosticByid(Long id );
    Diagonstic getDiagnostic(Long id);
    Diagonstic saveDiagnostic(Diagonstic D);
}
