package org.example.apprenantservice.services;

import org.example.apprenantservice.Modeles.Apprenant;
import org.example.apprenantservice.Repositorys.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApprenantService {

    @Autowired
    private ApprenantRepository apprenantRepository;
    public ApprenantService(ApprenantRepository apprenantRepository) {
        this.apprenantRepository = apprenantRepository;
    }

    // ajouter Apprenant
    public Apprenant addApprenat(Apprenant apprenant) {

        return apprenantRepository.save(apprenant);
    }
}
