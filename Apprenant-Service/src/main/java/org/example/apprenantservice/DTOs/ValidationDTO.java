package org.example.apprenantservice.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidationDTO {
    private Long id;
    private Long briefId;
    private Long apprenantId;
    private Long competenceId;
    private Long subCompetenceId;
    private boolean valide;
}
