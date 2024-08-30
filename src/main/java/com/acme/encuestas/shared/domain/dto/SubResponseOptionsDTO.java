package com.acme.encuestas.shared.domain.dto;

import java.time.LocalDateTime;

import com.acme.encuestas.shared.domain.entity.Response_options;

public class SubResponseOptionsDTO {
    private Long idopcionsubrespuesta;
    private int numero_subrespuesta;
    private LocalDateTime creado_en;
    private LocalDateTime actualizado_en;
    private String componentehtml;
    private Response_options response_options;
    public SubResponseOptionsDTO() {
    }
    public SubResponseOptionsDTO(Long idopcionsubrespuesta, int numero_subrespuesta, LocalDateTime creado_en,
            LocalDateTime actualizado_en, String componentehtml, Response_options response_options) {
        this.idopcionsubrespuesta = idopcionsubrespuesta;
        this.numero_subrespuesta = numero_subrespuesta;
        this.creado_en = creado_en;
        this.actualizado_en = actualizado_en;
        this.componentehtml = componentehtml;
        this.response_options = response_options;
    }
    public Long getIdopcionsubrespuesta() {
        return idopcionsubrespuesta;
    }
    public void setIdopcionsubrespuesta(Long idopcionsubrespuesta) {
        this.idopcionsubrespuesta = idopcionsubrespuesta;
    }
    public int getNumero_subrespuesta() {
        return numero_subrespuesta;
    }
    public void setNumero_subrespuesta(int numero_subrespuesta) {
        this.numero_subrespuesta = numero_subrespuesta;
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
    public String getComponentehtml() {
        return componentehtml;
    }
    public void setComponentehtml(String componentehtml) {
        this.componentehtml = componentehtml;
    }
    public Response_options getResponse_options() {
        return response_options;
    }
    public void setResponse_options(Response_options response_options) {
        this.response_options = response_options;
    }
    
}
