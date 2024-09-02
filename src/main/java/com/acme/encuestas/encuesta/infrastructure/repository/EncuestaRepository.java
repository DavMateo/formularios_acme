package com.acme.encuestas.encuesta.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acme.encuestas.shared.domain.entity.Surveys;

@Repository
public interface EncuestaRepository extends JpaRepository<Surveys, Long> {
    boolean existsByNombre(String nombre);
}
