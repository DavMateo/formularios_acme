package com.acme.encuestas.encuesta.infrastructure.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.acme.encuestas.encuesta.application.service.IEncuestaService;
import com.acme.encuestas.shared.domain.entity.Surveys;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/encuestas")
public class EncuestaController {

    private final IEncuestaService encuestaService;

    @Autowired
    public EncuestaController(IEncuestaService encuestaService) {
        this.encuestaService = encuestaService;
    }

    @GetMapping
    public List<Surveys> getAllSurveys() {
        return encuestaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Surveys> getSurveyById(@PathVariable Long id) {
        Optional<Surveys> survey = encuestaService.findById(id);
        if (survey.isPresent()) {
            return ResponseEntity.ok(survey.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
    public ResponseEntity<Surveys> createSurvey(@RequestBody Surveys surveys) {
        Surveys savedSurvey = encuestaService.save(surveys);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedSurvey);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Surveys> updateSurvey(@PathVariable Long id, @RequestBody Surveys surveys) {
        surveys.setIdencuesta(id);  
        try {
            Surveys updatedSurvey = encuestaService.update(surveys);
            return ResponseEntity.ok(updatedSurvey);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSurvey(@PathVariable Long id) {
        try {
            encuestaService.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}

