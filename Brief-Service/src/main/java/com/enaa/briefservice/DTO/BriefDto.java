package com.enaa.briefservice.DTO;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor
public class BriefDto implements Serializable {
    private Long id;
    private String titre;
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private List<Long> competenceIds;
}