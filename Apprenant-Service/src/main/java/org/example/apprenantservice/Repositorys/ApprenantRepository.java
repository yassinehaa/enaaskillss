package org.example.apprenantservice.Repositorys;

import org.example.apprenantservice.Modeles.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApprenantRepository extends JpaRepository<Apprenant,Long> {
}
