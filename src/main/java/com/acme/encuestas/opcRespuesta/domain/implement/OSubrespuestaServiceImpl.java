package com.acme.encuestas.opcRespuesta.domain.implement;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.encuestas.opcRespuesta.application.service.IOSubrespuestaService;
import com.acme.encuestas.opcRespuesta.infrastructure.repository.OSubrespuestaRepository;
import com.acme.encuestas.shared.domain.entity.Subresponse_options;

import jakarta.persistence.EntityNotFoundException;

@Service
public class OSubrespuestaServiceImpl implements IOSubrespuestaService {

    @Autowired
    private OSubrespuestaRepository oSubrespuestaRepository;
     

    @Override
    public List<Subresponse_options> findAll() {
        return oSubrespuestaRepository.findAll();
    }

    @Override
    public Optional<Subresponse_options> findById(Long id) {
        return oSubrespuestaRepository.findById(id);
    }

    @Override
    public Subresponse_options save(Subresponse_options subresponse_options) {
        //if (oSubrespuestaRepository.exists(subresponse_options)) {
        //    throw new RuntimeException("Ya existe una...");
        //}
        subresponse_options.setCreadoen(LocalDateTime.now());
        subresponse_options.setActualizadoen(LocalDateTime.now());
        return oSubrespuestaRepository.save(subresponse_options);
    }

    @Override
    public Subresponse_options update(Subresponse_options subresponse_options) {
        if (oSubrespuestaRepository.existsById(subresponse_options.getIdopcionsubrespuesta())) {
            subresponse_options.setActualizadoen(LocalDateTime.now());
            return oSubrespuestaRepository.save(subresponse_options);
        } else {
            throw new EntityNotFoundException("Subrespuesta no encontrada por id" + subresponse_options.getIdopcionsubrespuesta());
        }
       
    }

    @Override
    public void deleteById(Long id) {
       if (oSubrespuestaRepository.existsById(id)) {
           oSubrespuestaRepository.deleteById(id); 
       } else {
        throw new EntityNotFoundException("Subrespuesta no encontrada por id" + id);
       }
    }

    
}
