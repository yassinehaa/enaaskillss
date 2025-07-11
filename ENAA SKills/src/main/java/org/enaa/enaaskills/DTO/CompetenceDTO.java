package org.enaa.enaaskills.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompetenceDTO {
    private Long id;
    private String nom;
    private boolean valide;
    private List<SubCompetenceDTO> sousCompetences;
}