package com.enaa.briefservice.service;

import com.enaa.briefservice.DTO.BriefDto;
import com.enaa.briefservice.model.Brief;
import com.enaa.briefservice.repository.BriefRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BriefService {

    private final BriefRepository briefRepository;
    private final ModelMapper modelMapper;

    public BriefService(BriefRepository briefRepository, ModelMapper modelMapper) {
        this.briefRepository = briefRepository;
        this.modelMapper = modelMapper;
    }

    public BriefDto saveBrief(BriefDto briefDto) {
        Brief brief = modelMapper.map(briefDto, Brief.class);
        Brief savedBrief = briefRepository.save(brief);
        return modelMapper.map(savedBrief, BriefDto.class);
    }

    public List<BriefDto> getAllBriefs() {
        List<Brief> briefs = (List<Brief>) briefRepository.findAll();
        return briefs.stream()
                .map(brief -> modelMapper.map(brief, BriefDto.class))
                .collect(Collectors.toList());
    }

    public BriefDto getBriefById(Long id) {
        Brief brief = briefRepository.findById(id).orElseThrow();
        return modelMapper.map(brief, BriefDto.class);
    }

    public BriefDto updateBrief(Long id, BriefDto briefDto) {
        Brief existing = briefRepository.findById(id).orElseThrow();
        existing.setTitre(briefDto.getTitre());
        existing.setDescription(briefDto.getDescription());
        existing.setDateDebut(briefDto.getDateDebut());
        existing.setDateFin(briefDto.getDateFin());
        existing.setCompetenceIds(briefDto.getCompetenceIds());
        Brief updatedBrief = briefRepository.save(existing);
        return modelMapper.map(updatedBrief, BriefDto.class);
    }
}
