package com.acme.encuestas.shared.domain.dto;

import java.time.LocalDateTime;

public class SurveysDTO {
    private Long id_encuesta;
    private LocalDateTime creado_en;
    private LocalDateTime actualizado_en;
    private String descripcion;
    private String nombre;
    public SurveysDTO(Long id_encuesta, LocalDateTime creado_en, LocalDateTime actualizado_en, String descripcion,
            String nombre) {
        this.id_encuesta = id_encuesta;
        this.creado_en = creado_en;
        this.actualizado_en = actualizado_en;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }
    public SurveysDTO() {
    }
    public Long getId_encuesta() {
        return id_encuesta;
    }
    public void setId_encuesta(Long id_encuesta) {
        this.id_encuesta = id_encuesta;
    }
    public LocalDateTime getCreado_en() {
        return creado_en;
    }
    public void setCreado_en(LocalDateTime creado_en) {
        this.creado_en = creado_en;
    }
    public LocalDateTime getActualizado_en() {
        return actualizado_en;
    }
    public void setActualizado_en(LocalDateTime actualizado_en) {
        this.actualizado_en = actualizado_en;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
