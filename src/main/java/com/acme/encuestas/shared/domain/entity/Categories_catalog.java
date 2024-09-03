package com.acme.encuestas.shared.domain.entity;

// Importando las clases y paquetes necesarios
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "categories_catalog")
public class Categories_catalog {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categorias_catalogo", columnDefinition = "INT UNSIGNED", nullable = false)
    private Long idcategoriascatalogo;

    // Embeber elementos DATETIME
    @Column(name = "creado_en", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'creado_en' no puede ser nulo, ingrese información.")
    @PastOrPresent(message = "La fecha debe ser una actual o pasada, no se permite fechas futuras.")
    private LocalDateTime creadoen;

    @Column(name = "actualizado_en", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'actualizado_en' no puede ser nulo, ingrese información.")
    @PastOrPresent(message = "La fecha debe ser una actual o pasada, no se permite fechas futuras.")
    private LocalDateTime actualizadoen;

    @Column(name = "nombre", columnDefinition = "VARCHAR(255)", nullable = false)
    @NotBlank(message = "'nombre' no puede estar vacío.")
    @Size(min = 4, max = 255, message = "El nombre debe tener entre 4 y 255 caracteres.")
    private String nombre;


    // Creando los constructores de la clase
    public Categories_catalog() {

    }


    // Definiendo los getter y setter de "idcategoriascatalogo"
    public Long getIdcategoriascatalogo() {
        return idcategoriascatalogo;
    }
    public void setIdcategoriascatalogo(Long idcategoriascatalogo) {
        this.idcategoriascatalogo = idcategoriascatalogo;
    }

    // Definiendo los getter y setter de "creadoen"
    public LocalDateTime getCreadoen() {
        return creadoen;
    }
    public void setCreadoen(LocalDateTime creadoen) {
        this.creadoen = creadoen;
    }

    // Definiendo los getter y setter de "actualizadoen"
    public LocalDateTime getActualizadoen() {
        return actualizadoen;
    }
    public void setActualizadoen(LocalDateTime actualizadoen) {
        this.actualizadoen = actualizadoen;
    }

    // Definiendo los getter y setter de "nombre"
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}