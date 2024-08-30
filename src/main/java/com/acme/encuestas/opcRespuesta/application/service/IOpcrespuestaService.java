package com.acme.encuestas.opcRespuesta.application.service;

import java.util.List;
import java.util.Optional;

import com.acme.encuestas.shared.domain.entity.Response_options;

public interface IOpcrespuestaService {
    List<Response_options> findAll();
    Optional<Response_options> findById(Long id);
    Response_options save(Response_options response_options);
    Response_options update(Response_options response_options);
    void deleteById(Long id);
}
