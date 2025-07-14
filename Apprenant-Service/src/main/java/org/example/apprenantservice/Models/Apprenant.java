package org.example.apprenantservice.Models;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Apprenant {
    @Id
    @GeneratedValue
    private Long id;
    private String nomComplet;
    private String email;

    @OneToMany(mappedBy = "apprrent", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Rendu> rendus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Rendu> getRendus() {
        return rendus;
    }

    public void setRendus(List<Rendu> rendus) {
        this.rendus = rendus;
    }
}
