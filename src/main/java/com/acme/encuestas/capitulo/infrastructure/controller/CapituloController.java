package com.acme.encuestas.capitulo.infrastructure.controller;

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

import com.acme.encuestas.capitulo.application.service.ICapituloService;
import com.acme.encuestas.shared.domain.entity.Chapter;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/capitulo")
public class CapituloController {
    private final ICapituloService capituloService;

    @Autowired
    public CapituloController(ICapituloService capituloService){
        this.capituloService = capituloService;
    }

    @GetMapping
    public List<Chapter> getAllChapters() {
        return capituloService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chapter> getChapterById(@PathVariable Long id) {
        Optional<Chapter> chapter = capituloService.findById(id);
        if (chapter.isPresent()) {
            return ResponseEntity.ok(chapter.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
    public ResponseEntity<Chapter> createChapter(@RequestBody Chapter chapter) {
    Chapter savedChapter = capituloService.save(chapter);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedChapter);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Chapter> updateChapter(@PathVariable Long id, @RequestBody Chapter chapter) {
        chapter.setIdcapitulo(id);
        try{
            Chapter updateChapter = capituloService.update(chapter);
            return ResponseEntity.ok(updateChapter);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChapter(@PathVariable Long id) {
        try{
            capituloService.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND). build();
        }
    }

}


