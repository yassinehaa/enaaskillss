package org.example.apprenantservice.Repositories;

import org.example.apprenantservice.Models.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApprenantRepository extends JpaRepository<Apprenant,Long> {
}
