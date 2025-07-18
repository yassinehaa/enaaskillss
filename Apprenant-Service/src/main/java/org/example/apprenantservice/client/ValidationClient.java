package org.example.apprenantservice.client;

import org.example.apprenantservice.DTOs.ValidationDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "validation-service")
public interface ValidationClient {

    @GetMapping("/validations/apprenant/{apprenantId}")
    List<ValidationDTO> getValidationsByApprenantId(@PathVariable("apprenantId") Long apprenantId);
}
