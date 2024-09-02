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

import com.acme.encuestas.opcRespuesta.application.service.IOpcrespuestaService;  
import jakarta.persistence.EntityNotFoundException;
import com.acme.encuestas.shared.domain.entity.Response_options;

@RestController
@RequestMapping("/opciones_respuesta")  
public class OpcrespuestaController {
    
    private final IOpcrespuestaService opcrespuestaService;

    @Autowired
    public OpcrespuestaController(IOpcrespuestaService opcrespuestaService) {
        this.opcrespuestaService = opcrespuestaService;
    }

    @GetMapping
    public List<Response_options> getAllOpcrespuestas() {
        return opcrespuestaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response_options> getOpcrespuestaById(@PathVariable Long id) {
        Optional<Response_options> opcrespuesta = opcrespuestaService.findById(id);
        if (opcrespuesta.isPresent()) {
            return ResponseEntity.ok(opcrespuesta.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
    public ResponseEntity<Response_options> createOpcrespuesta(@RequestBody Response_options opcrespuesta) {
        Response_options savedOpcrespuesta = opcrespuestaService.save(opcrespuesta);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedOpcrespuesta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Response_options> updateOpcrespuesta(@PathVariable Long id, @RequestBody Response_options opcrespuesta) {
        opcrespuesta.setIdopcionesrespuesta(id);  // Asegúrate de que este método existe y corresponde a tu modelo
        try {
            Response_options updatedOpcrespuesta = opcrespuestaService.update(opcrespuesta);
            return ResponseEntity.ok(updatedOpcrespuesta);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOpcrespuesta(@PathVariable Long id) {
        try {
            opcrespuestaService.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}

