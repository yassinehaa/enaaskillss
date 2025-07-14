package com.enaa.briefservice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
public class Brief {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private Date dateDebut;
    private Date dateFin;

    @ElementCollection
    private List<Long> competenceIds;

    // Constructor for existing fields, now with competenceIds
    public Brief(Long id, String titre, String description, Date dateDebut, Date dateFin, List<Long> competenceIds) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.competenceIds = competenceIds;
    }
}
