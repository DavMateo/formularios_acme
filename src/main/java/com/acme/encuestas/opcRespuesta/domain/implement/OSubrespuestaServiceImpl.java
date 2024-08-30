package com.acme.encuestas.opcRespuesta.domain.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.encuestas.opcRespuesta.application.service.IOSubrespuestaService;
import com.acme.encuestas.opcRespuesta.infrastructure.repository.OSubrespuestaRepository;
import com.acme.encuestas.shared.domain.entity.Subresponse_options;

@Service
public class OSubrespuestaServiceImpl implements IOSubrespuestaService {

    @Autowired
    private OSubrespuestaRepository oSubrespuestaRepository;
     

    @Override
    public List<Subresponse_options> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<Subresponse_options> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Subresponse_options save(Subresponse_options subresponse_options) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Subresponse_options update(Subresponse_options subresponse_options) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    
}
