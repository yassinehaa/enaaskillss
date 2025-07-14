package org.example.apprenantservice.services;

import org.example.apprenantservice.Models.Rendu;
import org.example.apprenantservice.Repositories.RenduRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RenduService {

    @Autowired
    private RenduRepository renduRepository;

    public RenduService(RenduRepository renduRepository) {
        this.renduRepository = renduRepository;
    }

    public Rendu ajouterRendu(Rendu rendu) {

        return renduRepository.save(rendu);
    }

    public List<Rendu> getRendus() {

        return renduRepository.findAll();
    }
}
