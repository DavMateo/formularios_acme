package com.acme.encuestas.opcRespuesta.infrastructure.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.encuestas.opcRespuesta.application.service.IOSubrespuestaService;
import com.acme.encuestas.shared.domain.entity.Subresponse_options;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/opciones_subrespuesta")
public class OSubrespuestaController {
    private final IOSubrespuestaService subrespuestaService;

    @Autowired
    public OSubrespuestaController(IOSubrespuestaService subrespuestaService) {
        this.subrespuestaService = subrespuestaService;
    }

    @GetMapping
    public List<Subresponse_options> getAllSubresponse() {
        return subrespuestaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Subresponse_options> getSubresponseById(@PathVariable Long id) {
        Optional<Subresponse_options> subresponse = subrespuestaService.findById(id);
        if (subresponse.isPresent()) {
            return ResponseEntity.ok(subresponse.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
    public ResponseEntity<Subresponse_options> createSubresponse(@RequestBody Subresponse_options subresponse_options) {
        Subresponse_options savedSubresponse = subrespuestaService.save(subresponse_options);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedSubresponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Subresponse_options> updateSubresponse(@PathVariable Long id, @RequestBody Subresponse_options subresponse_options) {
        subresponse_options.setIdopcionsubrespuesta(id);
        try{
            Subresponse_options updateSubresponse = subrespuestaService.update(subresponse_options);
            return ResponseEntity.ok(updateSubresponse);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSubresponse(@PathVariable Long id){
        try {
            subrespuestaService.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
