package com.enaa.briefservice.repository;
import com.enaa.briefservice.model.Brief;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BriefRepository extends JpaRepository<Brief, Long> {
}
