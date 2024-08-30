package com.acme.encuestas.pregunta.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.encuestas.shared.domain.entity.Questions;

public interface PreguntaRepository extends JpaRepository<Questions, Long> {
    
}
