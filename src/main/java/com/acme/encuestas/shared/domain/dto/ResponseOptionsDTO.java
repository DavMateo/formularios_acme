package com.acme.encuestas.shared.domain.dto;

import java.time.LocalDateTime;

import com.acme.encuestas.shared.domain.entity.Questions;
import com.acme.encuestas.shared.domain.entity.Response_options;

public class ResponseOptionsDTO {
    private Long idopcionespregunta;
    private String opcionvalor;
    private LocalDateTime creado_en;
    private LocalDateTime actualizado_en;
    private String tipocomponentehtml;
    private String comentarios;
    private String textoopcion;
    private Response_options response_options;
    private Questions questions;
    public ResponseOptionsDTO() {
    }
    public ResponseOptionsDTO(Long idopcionespregunta, String opcionvalor, LocalDateTime creado_en,
            LocalDateTime actualizado_en, String tipocomponentehtml, String comentarios, String textoopcion,
            Response_options response_options, Questions questions) {
        this.idopcionespregunta = idopcionespregunta;
        this.opcionvalor = opcionvalor;
        this.creado_en = creado_en;
        this.actualizado_en = actualizado_en;
        this.tipocomponentehtml = tipocomponentehtml;
        this.comentarios = comentarios;
        this.textoopcion = textoopcion;
        this.response_options = response_options;
        this.questions = questions;
    }
    public Long getIdopcionespregunta() {
        return idopcionespregunta;
    }
    public void setIdopcionespregunta(Long idopcionespregunta) {
        this.idopcionespregunta = idopcionespregunta;
    }
    public String getOpcionvalor() {
        return opcionvalor;
    }
    public void setOpcionvalor(String opcionvalor) {
        this.opcionvalor = opcionvalor;
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
    public String getTipocomponentehtml() {
        return tipocomponentehtml;
    }
    public void setTipocomponentehtml(String tipocomponentehtml) {
        this.tipocomponentehtml = tipocomponentehtml;
    }
    public String getComentarios() {
        return comentarios;
    }
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    public String getTextoopcion() {
        return textoopcion;
    }
    public void setTextoopcion(String textoopcion) {
        this.textoopcion = textoopcion;
    }
    public Response_options getResponse_options() {
        return response_options;
    }
    public void setResponse_options(Response_options response_options) {
        this.response_options = response_options;
    }
    public Questions getQuestions() {
        return questions;
    }
    public void setQuestions(Questions questions) {
        this.questions = questions;
    }
    
}
