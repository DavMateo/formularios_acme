package com.acme.encuestas.pregunta.domain.implement;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.acme.encuestas.pregunta.application.service.IPreguntaService;
import com.acme.encuestas.pregunta.infrastructure.repository.PreguntaRepository;
import com.acme.encuestas.shared.domain.entity.Questions;

import jakarta.persistence.EntityNotFoundException;

public class PreguntaServiceImpl implements IPreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    @Override
    public List<Questions> findAll() {
        return preguntaRepository.findAll();
    }

    @Override
    public Optional<Questions> findById(Long id) {
        return preguntaRepository.findById(id);
    }

    @Override
    public Questions save(Questions questions) {
        questions.setCreadoen(LocalDateTime.now());
        questions.setActualizadoen(LocalDateTime.now());
        return preguntaRepository.save(questions);
    }

    @Override
    public Questions update(Questions questions) {
        if (preguntaRepository.existsById(questions.getIdpregunta())) {
            questions.setActualizadoen(LocalDateTime.now());
            return preguntaRepository.save(questions);
        } else {
            throw new EntityNotFoundException("Pregunta no encontrada por id:" + questions.getIdpregunta());
        }
    }

    @Override
    public void deleteById(Long id) {
       if (preguntaRepository.existsById(id)) {
           preguntaRepository.deleteById(id);
       } else {
        throw new EntityNotFoundException("Pregunta no encontrada por Id" + id);
       }
    }
    
}
