package org.example.apprenantservice.services;

import org.example.apprenantservice.DTOs.RenduDetailsDTO;
import org.example.apprenantservice.DTOs.ValidationDTO;
import org.example.apprenantservice.Models.Rendu;
import org.example.apprenantservice.Repositories.RenduRepository;
import org.example.apprenantservice.client.ValidationClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RenduService {

    private final RenduRepository renduRepository;
    private final ValidationClient validationClient;

    public RenduService(RenduRepository renduRepository, ValidationClient validationClient) {
        this.renduRepository = renduRepository;
        this.validationClient = validationClient;
    }

    public Rendu ajouterRendu(Rendu rendu) {
        return renduRepository.save(rendu);
    }

    public List<RenduDetailsDTO> getRendus() {
        List<Rendu> rendus = renduRepository.findAll();
        return rendus.stream().map(rendu -> {
            List<ValidationDTO> validations = validationClient.getValidationsByApprenantId(rendu.getApprrent().getId());
            RenduDetailsDTO dto = new RenduDetailsDTO();
            dto.setId(rendu.getId());
            dto.setLien(rendu.getLien());
            dto.setDateDepot(rendu.getDateDepot());
            dto.setBriefId(rendu.getBriefId());
            dto.setApprenantId(rendu.getApprrent().getId());
            dto.setValidations(validations);
            return dto;
        }).collect(Collectors.toList());
    }
}
