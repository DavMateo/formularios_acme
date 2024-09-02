package com.acme.encuestas.capitulo.domain.implement;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.encuestas.capitulo.application.service.ICapituloService;
import com.acme.encuestas.capitulo.infrastructure.repository.CapituloRepository;
import com.acme.encuestas.shared.domain.entity.Chapter;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CapituloServiceImpl implements ICapituloService {

    @Autowired
    private CapituloRepository capituloRepository;

    @Override
    public List<Chapter> findAll() {
        return capituloRepository.findAll();
    }

    @Override
    public Optional<Chapter> findById(Long id) {
        return capituloRepository.findById(id);
    }

    @Override
    public Chapter save(Chapter chapter) {
        if (capituloRepository.existsByTitulo(chapter.getTitulocapitulo())) {
            throw new RuntimeException("Ya existe este titulo");
        }
        chapter.setCreadoen(LocalDateTime.now());
        chapter.setActualizadoen(LocalDateTime.now());
        return capituloRepository.save(chapter);
    }

    @Override
    public Chapter update(Chapter chapter) {
        if (capituloRepository.existsById(chapter.getIdcapitulo())) {
            chapter.setActualizadoen((LocalDateTime.now()));
            return capituloRepository.save(chapter);
        } else {
            throw new EntityNotFoundException("Capitulo no encontrado por id:" + chapter.getIdcapitulo());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (capituloRepository.existsById(id)) {
            capituloRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Capitulo no encontrado por id:" + id);
        }
    }
    
}
