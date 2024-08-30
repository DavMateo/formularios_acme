package com.acme.encuestas.pregunta.application.service;

import java.util.List;
import java.util.Optional;

import com.acme.encuestas.shared.domain.entity.Questions;

public interface IPreguntaService {
    List<Questions> findAll();
    Optional<Questions> findById(Long id);
    Questions save(Questions questions);
    Questions update(Questions questions);
    void deleteById(Long id);
}
