package com.example.backenddev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.backenddev.model.Diagonstic;

@Repository
public interface DiagnosticRepository extends JpaRepository<Diagonstic,Long> {
}
