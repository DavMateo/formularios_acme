package com.acme.encuestas.opcRespuesta.application.service;

import java.util.List;
import java.util.Optional;

import com.acme.encuestas.shared.domain.entity.Subresponse_options;

public interface IOSubrespuestaService {
    List<Subresponse_options> findAll();
    Optional<Subresponse_options> findById(Long id);
    Subresponse_options save(Subresponse_options subresponse_options);
    Subresponse_options update(Subresponse_options subresponse_options);
    void deleteById(Long id);
}
