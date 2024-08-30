package com.acme.encuestas.capitulo.domain.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.encuestas.capitulo.application.service.ICapituloService;
import com.acme.encuestas.capitulo.infrastructure.repository.CapituloRepository;
import com.acme.encuestas.shared.domain.entity.Chapter;

@Service
public class CapituloServiceImpl implements ICapituloService {

    @Autowired
    private CapituloRepository capituloRepository;

    @Override
    public List<Chapter> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<Chapter> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Chapter save(Chapter chapter) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Chapter update(Chapter chapter) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
    
}
