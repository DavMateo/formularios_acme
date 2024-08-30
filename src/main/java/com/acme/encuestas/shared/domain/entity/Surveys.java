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
@Table(name = "encuestas")
public class Surveys {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_encuesta", columnDefinition = "INT UNSIGNED", nullable = false)
    @NotBlank(message = "'id_encuesta' no puede estar vacío.")
    @Size(min = 1, max = 8, message = "El id_encuesta debe tener una longitud de 1 a 8 dígitos.")
    private Long idencuesta;
    
    // Embeber elementos DATETIME
    @Column(name = "creado_en", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'creado_en' no puede ser nulo, ingrese información.")
    @PastOrPresent(message = "La fecha debe ser una actual o pasada, no se permite fechas futuras.")
    private LocalDateTime creadoen;

    @Column(name = "actualizado_en", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'actualizado_en' no puede ser nulo, ingrese información.")
    @PastOrPresent(message = "La fecha debe ser una actual o pasada, no se permite fechas futuras.")
    private LocalDateTime actualizadoen;

    @Column(name = "descripcion", columnDefinition = "VARCHAR(255)", nullable = false)
    @NotBlank(message = "'descripcion' no puede estar vacío.")
    @Size(min = 20, max = 255, message = "La descripción debe tener una longitud de 20 a 255 caracteres.")
    private String descripcion;

    @Column(name = "nombre", columnDefinition = "VARCHAR(255)", nullable = false)
    @NotBlank(message = "'nombre' no puede estar vacío.")
    @Size(min = 10, max = 255, message = "El nombre debe tener una longitud de 10 a 255 caracteres.")
    private String nombre;


    // Creando los constructores de la clase
    public Surveys() {

    }


    // Definiendo los getter y setter de "idencuesta"
    public Long getIdencuesta() {
        return idencuesta;
    }
    public void setIdencuesta(Long idencuesta) {
        this.idencuesta = idencuesta;
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

    // Definiendo los getter y setter de "descripcion"
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Definiendo los getter y setter de "nombre"
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
}