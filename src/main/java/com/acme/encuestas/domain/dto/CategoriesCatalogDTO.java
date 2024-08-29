package com.acme.encuestas.domain.dto;

import java.time.LocalDateTime;

public class CategoriesCatalogDTO {
    private Long idcategoriascatalogo;
    private LocalDateTime creado_en;
    private LocalDateTime actualizado_en;
    private String nombre;
    public CategoriesCatalogDTO() {
    }
    public CategoriesCatalogDTO(Long idcategoriascatalogo, LocalDateTime creado_en, LocalDateTime actualizado_en,
            String nombre) {
        this.idcategoriascatalogo = idcategoriascatalogo;
        this.creado_en = creado_en;
        this.actualizado_en = actualizado_en;
        this.nombre = nombre;
    }
    public Long getIdcategoriascatalogo() {
        return idcategoriascatalogo;
    }
    public void setIdcategoriascatalogo(Long idcategoriascatalogo) {
        this.idcategoriascatalogo = idcategoriascatalogo;
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
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
