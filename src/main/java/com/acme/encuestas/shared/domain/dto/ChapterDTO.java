package com.acme.encuestas.shared.domain.dto;

import java.time.LocalDateTime;

import com.acme.encuestas.shared.domain.entity.Surveys;

public class ChapterDTO {
    private Long idcapitulo;
    private LocalDateTime creado_en;
    private LocalDateTime actualizado_en;
    private String numerocapitulo;
    private String titulocapitulo;
    private Surveys surveys;
    public ChapterDTO() {
    }
    public ChapterDTO(Long idcapitulo, LocalDateTime creado_en, LocalDateTime actualizado_en, String numerocapitulo,
            String titulocapitulo, Surveys surveys) {
        this.idcapitulo = idcapitulo;
        this.creado_en = creado_en;
        this.actualizado_en = actualizado_en;
        this.numerocapitulo = numerocapitulo;
        this.titulocapitulo = titulocapitulo;
        this.surveys = surveys;
    }
    public Long getIdcapitulo() {
        return idcapitulo;
    }
    public void setIdcapitulo(Long idcapitulo) {
        this.idcapitulo = idcapitulo;
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
    public String getNumerocapitulo() {
        return numerocapitulo;
    }
    public void setNumerocapitulo(String numerocapitulo) {
        this.numerocapitulo = numerocapitulo;
    }
    public String getTitulocapitulo() {
        return titulocapitulo;
    }
    public void setTitulocapitulo(String titulocapitulo) {
        this.titulocapitulo = titulocapitulo;
    }
    public Surveys getSurveys() {
        return surveys;
    }
    public void setSurveys(Surveys surveys) {
        this.surveys = surveys;
    }
    
}
