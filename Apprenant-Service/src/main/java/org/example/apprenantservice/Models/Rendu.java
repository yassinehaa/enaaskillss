package org.example.apprenantservice.Models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Rendu {

    @Id
    @GeneratedValue
    private Long id;
    private String lien;
    private Date dateDepot;
    private Long briefId;


    @ManyToOne
    @JsonBackReference
    private Apprenant apprrent;

    public Long getBriefId() {
        return briefId;
    }

    public void setBriefId(Long briefId) {
        this.briefId = briefId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }

    public Date getDateDepot() {
        return dateDepot;
    }

    public void setDateDepot(Date dateDepot) {
        this.dateDepot = dateDepot;
    }

    public Apprenant getApprrent() {
        return apprrent;
    }

    public void setApprrent(Apprenant apprrent) {
        this.apprrent = apprrent;
    }
}
