package org.example.apprenantservice.Controllers;


import org.example.apprenantservice.Models.Rendu;
import org.example.apprenantservice.services.RenduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Rendu")
public class RenduController {

    @Autowired
    private RenduService renduService;
    public RenduController(RenduService renduService) {
        this.renduService = renduService;
    }

    @PostMapping("/ajouter-Rendu")
    public Rendu ajouterRendu(@RequestBody Rendu rendu) {
        return renduService.ajouterRendu(rendu);
    }

    @GetMapping("/get-Rendu")
    public List<Rendu> getRendu() {
        return renduService.getRendus();
    }
}
