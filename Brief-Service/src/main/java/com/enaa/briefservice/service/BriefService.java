package com.enaa.briefservice.service;

import com.enaa.briefservice.DTO.BriefDto;
import com.enaa.briefservice.model.Brief;
import com.enaa.briefservice.repository.BriefRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BriefService {

    private final BriefRepository briefRepository;

    public BriefService(BriefRepository briefRepository) {
        this.briefRepository = briefRepository;
    }

    public BriefDto saveBrief(BriefDto briefDto) {

        return briefRepository.save(briefDto);
    }

    public List<BriefDto> getAllBriefs() {

        return briefRepository.findAll();
    }

    public BriefDto getBriefById(Long id) {

        return briefRepository.findById(id).orElseThrow();
    }

    public BriefDto updateBrief(Long id, Brief brief) {
        Brief existing = briefRepository.findById(id).orElseThrow();
        existing.setTitre(brief.getTitre());
        existing.setDescription(brief.getDescription());
        existing.setDateDebut(brief.getDateDebut());
        existing.setDateFin(brief.getDateFin());
        return briefRepository.save(existing);
    }
}
