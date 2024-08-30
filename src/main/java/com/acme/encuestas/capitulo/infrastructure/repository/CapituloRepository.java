package com.acme.encuestas.capitulo.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.encuestas.shared.domain.entity.Chapter;

public interface CapituloRepository extends JpaRepository<Chapter, Long> {
    
}
