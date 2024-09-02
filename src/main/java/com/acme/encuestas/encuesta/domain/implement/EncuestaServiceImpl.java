package com.acme.encuestas.encuesta.domain.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.encuestas.encuesta.application.service.IEncuestaService;
import com.acme.encuestas.encuesta.infrastructure.repository.EncuestaRepository;
import com.acme.encuestas.shared.domain.entity.Surveys;

import jakarta.persistence.EntityNotFoundException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class EncuestaServiceImpl implements IEncuestaService {

    @Autowired
    private EncuestaRepository encuestaRepository;

    @Override
    public List<Surveys> findAll() {
        return encuestaRepository.findAll();
    }

    @Override
    public Optional<Surveys> findById(Long id) {
        return encuestaRepository.findById(id);
    }

    @Override
    public Surveys save(Surveys surveys) {
        // Verificar si ya existe una encuesta con el mismo nombre
        if (encuestaRepository.existsByNombre(surveys.getNombre())) {
            throw new RuntimeException("Ya existe una encuesta con el nombre proporcionado.");
        }
        surveys.setCreadoen(LocalDateTime.now());
        surveys.setActualizadoen(LocalDateTime.now());
        return encuestaRepository.save(surveys);
    }

    @Override
    public Surveys update(Surveys surveys) {
        if (encuestaRepository.existsById(surveys.getIdencuesta())) {
            surveys.setActualizadoen(LocalDateTime.now());
            return encuestaRepository.save(surveys);
        } else {
            throw new EntityNotFoundException("Encuesta no encontrada por id: " + surveys.getIdencuesta());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (encuestaRepository.existsById(id)) {
            encuestaRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Encuesta no encontrada por id: " + id);
        }
    }
}


