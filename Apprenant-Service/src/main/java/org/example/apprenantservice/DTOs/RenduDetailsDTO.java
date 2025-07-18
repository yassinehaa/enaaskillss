package org.example.apprenantservice.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RenduDetailsDTO {
    private Long id;
    private String lien;
    private Date dateDepot;
    private Long briefId;
    private Long apprenantId;
    private List<ValidationDTO> validations;
}
