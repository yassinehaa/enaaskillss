package com.enaa.validationservice.controller;

import com.enaa.validationservice.model.Validation;
import com.enaa.validationservice.service.ValidationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/validations")
public class ValidationController {

    private final ValidationService validationService;

    public ValidationController(ValidationService validationService) {
        this.validationService = validationService;
    }

    @PostMapping
    public Validation save(@RequestBody Validation validation) {
        return validationService.save(validation);
    }

    @GetMapping
    public List<Validation> findAll() {
        return validationService.findAll();
    }

    @GetMapping("/apprenant/{apprenantId}")
    public List<Validation> findByApprenantId(@PathVariable Long apprenantId) {
        return validationService.findByApprenantId(apprenantId);
    }
}
