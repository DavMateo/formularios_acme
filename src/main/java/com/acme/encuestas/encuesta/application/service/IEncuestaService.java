package com.acme.encuestas.encuesta.application.service;

import java.util.List;
import java.util.Optional;

import com.acme.encuestas.shared.domain.entity.Surveys;

public interface IEncuestaService {
    List<Surveys> findAll();
    Optional<Surveys> findById(Long id);
    Surveys save(Surveys surveys);
    Surveys update(Surveys surveys);
    void deleteById(Long id);
}
