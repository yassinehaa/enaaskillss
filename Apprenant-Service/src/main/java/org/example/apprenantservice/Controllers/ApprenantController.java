package org.example.apprenantservice.Controllers;


import org.example.apprenantservice.Modeles.Apprenant;
import org.example.apprenantservice.services.ApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Apprenant")
public class ApprenantController {

    @Autowired
    private ApprenantService apprenantService;
    public ApprenantController(ApprenantService apprenantService) {
        this.apprenantService = apprenantService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Apprenant ajouterApprenant(@RequestBody Apprenant apprenant) {
        return apprenantService.addApprenat(apprenant);
    }
}
