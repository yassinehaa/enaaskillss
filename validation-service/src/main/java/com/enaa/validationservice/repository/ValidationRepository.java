package com.enaa.validationservice.repository;

import com.enaa.validationservice.model.Validation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ValidationRepository extends JpaRepository<Validation, Long> {
    List<Validation> findByApprenantId(Long apprenantId);
}
