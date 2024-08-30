package com.acme.encuestas.pregunta.domain.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.acme.encuestas.pregunta.application.service.IPreguntaService;
import com.acme.encuestas.pregunta.infrastructure.repository.PreguntaRepository;
import com.acme.encuestas.shared.domain.entity.Questions;

public class PreguntaServiceImpl implements IPreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    @Override
    public List<Questions> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<Questions> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Questions save(Questions questions) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Questions update(Questions questions) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
    
}
