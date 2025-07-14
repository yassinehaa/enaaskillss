package org.example.apprenantservice.DTOs;


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;


public class BriefDto implements Serializable {
    private final Long id;
    private final String titre;
    private final String description;
    private final Date dateDebut;
    private final Date dateFin;
    private final List<Long> competenceIds;

    public BriefDto(Long id, String titre, String description, Date dateDebut, Date dateFin, List<Long> competenceIds) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.competenceIds = competenceIds;
    }

    public Long getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public List<Long> getCompetenceIds() {
        return competenceIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BriefDto entity = (BriefDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.titre, entity.titre) &&
                Objects.equals(this.description, entity.description) &&
                Objects.equals(this.dateDebut, entity.dateDebut) &&
                Objects.equals(this.dateFin, entity.dateFin) &&
                Objects.equals(this.competenceIds, entity.competenceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titre, description, dateDebut, dateFin, competenceIds);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "titre = " + titre + ", " +
                "description = " + description + ", " +
                "dateDebut = " + dateDebut + ", " +
                "dateFin = " + dateFin + ", " +
                "competenceIds = " + competenceIds + ")";
    }
}