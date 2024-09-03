package com.acme.encuestas.pregunta.infrastructure.controllers;

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

import com.acme.encuestas.pregunta.application.service.IPreguntaService;
import com.acme.encuestas.shared.domain.entity.Questions;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/preguntas")
public class PreguntaController {
    private final IPreguntaService preguntaService;

    @Autowired
    public PreguntaController(IPreguntaService preguntaService) {
        this.preguntaService = preguntaService;
    }

    @GetMapping
    public List<Questions> getAllQuestions() {
        return preguntaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Questions> getQuestionById(@PathVariable Long id) {
        Optional<Questions> question = preguntaService.findById(id);
        if (question.isPresent()) {
            return ResponseEntity.ok(question.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
    public ResponseEntity<Questions> createQuestion(@RequestBody Questions questions) {
        Questions savedQuestion = preguntaService.save(questions);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedQuestion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Questions> updateQuestion(@PathVariable Long id, @RequestBody Questions questions) {
        questions.setIdpregunta(id);
        try {
            Questions updateQuestion = preguntaService.update(questions);
            return ResponseEntity.ok(updateQuestion);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuestion(@PathVariable Long id) {
        try {
            preguntaService.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
