package com.acme.encuestas.capitulo.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acme.encuestas.shared.domain.entity.Chapter;

@Repository
public interface CapituloRepository extends JpaRepository<Chapter, Long> {
    boolean existsBytitulocapitulo(String titulocapitulo);   
}
