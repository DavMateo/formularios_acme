package com.acme.encuestas.opcRespuesta.domain.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.encuestas.opcRespuesta.application.service.IOpcrespuestaService;
import com.acme.encuestas.opcRespuesta.infrastructure.repository.OpcrespuestaRepository;
import com.acme.encuestas.shared.domain.entity.Response_options;

@Service
public class OpcrespuestaServiceImpl implements IOpcrespuestaService {

    @Autowired
    private OpcrespuestaRepository opcrespuestaRepository;


    @Override
    public List<Response_options> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<Response_options> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Response_options save(Response_options response_options) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Response_options update(Response_options response_options) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
    
}
