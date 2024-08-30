package com.acme.encuestas.shared.domain.dto;

public class RolesDTO {
    private Long idroles;
    private String nombre;
    public RolesDTO() {
    }
    public RolesDTO(Long idroles, String nombre) {
        this.idroles = idroles;
        this.nombre = nombre;
    }
    public Long getIdroles() {
        return idroles;
    }
    public void setIdroles(Long idroles) {
        this.idroles = idroles;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
