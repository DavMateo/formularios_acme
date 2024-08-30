package com.acme.encuestas.encuesta.domain.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.encuestas.encuesta.application.service.IEncuestaService;
import com.acme.encuestas.encuesta.infrastructure.repository.EncuestaRepository;
import com.acme.encuestas.shared.domain.entity.Surveys;

@Service
public class EncuestaServiceImpl implements IEncuestaService {

    @Autowired
    private EncuestaRepository encuestaRepository;


    @Override
    public List<Surveys> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<Surveys> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Surveys save(Surveys surveys) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Surveys update(Surveys surveys) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
    
}
