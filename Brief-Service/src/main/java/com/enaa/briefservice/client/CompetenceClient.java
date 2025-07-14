package com.enaa.briefservice.client;

import com.enaa.briefservice.DTO.CompetenceDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "ENAA SKills",url = "http://localhost:8080")

public interface CompetenceClient {

    @GetMapping("/api/competences")
    List<CompetenceDto> getAll();

    @GetMapping("/api/competences/{competenceId}")
    CompetenceDto getCompetenceById(@PathVariable Long competenceId);
}
