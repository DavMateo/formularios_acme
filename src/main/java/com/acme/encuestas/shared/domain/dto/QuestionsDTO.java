package com.acme.encuestas.shared.domain.dto;

import java.time.LocalDateTime;

import com.acme.encuestas.shared.domain.entity.Chapter;

public class QuestionsDTO {
    private Long idpregunta;
    private LocalDateTime creado_en;
    private LocalDateTime actualizado_en;
    private String numeropregunta;
    private String tiporespuesta;
    private String comentariopregunta;
    private String enunciado;
    private Chapter chapter;
    public QuestionsDTO() {
    }
    public QuestionsDTO(Long idpregunta, LocalDateTime creado_en, LocalDateTime actualizado_en, String numeropregunta,
            String tiporespuesta, String comentariopregunta, String enunciado, Chapter chapter) {
        this.idpregunta = idpregunta;
        this.creado_en = creado_en;
        this.actualizado_en = actualizado_en;
        this.numeropregunta = numeropregunta;
        this.tiporespuesta = tiporespuesta;
        this.comentariopregunta = comentariopregunta;
        this.enunciado = enunciado;
        this.chapter = chapter;
    }
    public Long getIdpregunta() {
        return idpregunta;
    }
    public void setIdpregunta(Long idpregunta) {
        this.idpregunta = idpregunta;
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
    public String getNumeropregunta() {
        return numeropregunta;
    }
    public void setNumeropregunta(String numeropregunta) {
        this.numeropregunta = numeropregunta;
    }
    public String getTiporespuesta() {
        return tiporespuesta;
    }
    public void setTiporespuesta(String tiporespuesta) {
        this.tiporespuesta = tiporespuesta;
    }
    public String getComentariopregunta() {
        return comentariopregunta;
    }
    public void setComentariopregunta(String comentariopregunta) {
        this.comentariopregunta = comentariopregunta;
    }
    public String getEnunciado() {
        return enunciado;
    }
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    public Chapter getChapter() {
        return chapter;
    }
    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }
    
}
