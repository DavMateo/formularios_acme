package com.acme.encuestas.opcRespuesta.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.encuestas.shared.domain.entity.Response_options;

public interface OpcrespuestaRepository extends JpaRepository<Response_options, Long>{
    
}
