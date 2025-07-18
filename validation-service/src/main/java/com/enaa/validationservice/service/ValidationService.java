package com.enaa.validationservice.service;

import com.enaa.validationservice.client.CompetenceClient;
import com.enaa.validationservice.model.Validation;
import com.enaa.validationservice.repository.ValidationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValidationService {

    private final ValidationRepository validationRepository;
    private final CompetenceClient competenceClient;

    public ValidationService(ValidationRepository validationRepository, CompetenceClient competenceClient) {
        this.validationRepository = validationRepository;
        this.competenceClient = competenceClient;
    }

    public Validation save(Validation validation) {
        Validation savedValidation = validationRepository.save(validation);
        if (savedValidation.isValide()) {
            competenceClient.validateSubCompetence(savedValidation.getCompetenceId(), savedValidation.getSubCompetenceId());
        }
        return savedValidation;
    }

    public List<Validation> findAll() {
        return validationRepository.findAll();
    }

    public List<Validation> findByApprenantId(Long apprenantId) {
        return validationRepository.findByApprenantId(apprenantId);
    }
}
