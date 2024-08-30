package com.acme.encuestas.capitulo.application.service;

import java.util.List;
import java.util.Optional;

import com.acme.encuestas.shared.domain.entity.Chapter;

public interface ICapituloService {
    List<Chapter> findAll();
    Optional<Chapter> findById(Long id);
    Chapter save(Chapter chapter);
    Chapter update(Chapter chapter);
    void deleteById(Long id);
}
