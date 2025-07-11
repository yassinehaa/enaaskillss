package org.example.apprenantservice;


import org.example.apprenantservice.Modeles.Apprenant;
import org.example.apprenantservice.Repositorys.ApprenantRepository;
import org.example.apprenantservice.services.ApprenantService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest // utilise H2
@Import(ApprenantService.class)
public class testAddApprenant {

    @Autowired
    private ApprenantRepository apprenantRepository;

    @Autowired
    private ApprenantService apprenantService;

    @Test
    public void testAddApprenant() {
        // Given
        Apprenant apprenant = new Apprenant();
        apprenant.setNomComplet("Ismail El Hiba");
        apprenant.setEmail("ismail@example.com");

        // When
        Apprenant saved = apprenantService.addApprenat(apprenant);

        // Then
        assertNotNull(saved.getId());
        assertEquals(apprenant.getNomComplet(), saved.getNomComplet());
        assertEquals(apprenant.getEmail(), saved.getEmail());
    }
}
