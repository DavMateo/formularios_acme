package com.acme.encuestas.opcRespuesta.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.encuestas.shared.domain.entity.Subresponse_options;

public interface OSubrespuestaRepository extends JpaRepository<Subresponse_options, Long> {

}
