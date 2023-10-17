package com.example.backenddev.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "diagnostic")
public class Diagonstic {

    public Diagonstic() {
    }



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_diagnostique;
   
    
    
    public void setId_diagnostique(Long id_diagnostique) {
        this.id_diagnostique = id_diagnostique;
    }

  
   

}
