package com.acme.encuestas.opcRespuesta.domain.implement;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.encuestas.opcRespuesta.application.service.IOpcrespuestaService;
import com.acme.encuestas.opcRespuesta.infrastructure.repository.OpcrespuestaRepository;
import com.acme.encuestas.shared.domain.entity.Response_options;

import jakarta.persistence.EntityNotFoundException;

@Service
public class OpcrespuestaServiceImpl implements IOpcrespuestaService {

    @Autowired
    private OpcrespuestaRepository opcrespuestaRepository;


    @Override
    public List<Response_options> findAll() {
        return opcrespuestaRepository.findAll();
    }

    @Override
    public Optional<Response_options> findById(Long id) {
        return opcrespuestaRepository.findById(id);
    }

    @Override
    public Response_options save(Response_options response_options) {
        response_options.setCreadoen(LocalDateTime.now());
        response_options.setActualizadoen(LocalDateTime.now());
        return opcrespuestaRepository.save(response_options);
    }

    @Override
    public Response_options update(Response_options response_options) {
        if (opcrespuestaRepository.existsById(response_options.getIdopcionesrespuesta())) {
            response_options.setActualizadoen(LocalDateTime.now());
            return opcrespuestaRepository.save(response_options);
        } else {
            throw new EntityNotFoundException("Opcion respuesta no encontrada por id" + response_options.getIdopcionesrespuesta());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (opcrespuestaRepository.existsById(id)) {
            opcrespuestaRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Opcion respuesta no encontrada por id" + id);
        }
    }
    
}
