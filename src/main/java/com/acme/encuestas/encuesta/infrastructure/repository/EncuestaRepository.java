package com.acme.encuestas.encuesta.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.encuestas.shared.domain.entity.Surveys;

public interface EncuestaRepository extends JpaRepository<Surveys, Long> {
    
}
