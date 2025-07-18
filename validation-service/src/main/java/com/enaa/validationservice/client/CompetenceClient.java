package com.enaa.validationservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "enaa-skills")
public interface CompetenceClient {

    @PutMapping("/competences/{competenceId}/subcompetences/{subCompetenceId}/validate")
    void validateSubCompetence(@PathVariable("competenceId") Long competenceId,
                               @PathVariable("subCompetenceId") Long subCompetenceId);
}
