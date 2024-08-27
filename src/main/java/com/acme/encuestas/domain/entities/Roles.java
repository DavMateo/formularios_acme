package com.acme.encuestas.domain.entities;

// Importando las clases y paquetes necesarios
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "rol")
public class Roles {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_roles", columnDefinition = "INT UNSIGNED", nullable = false)
    @NotBlank(message = "'id_roles' no puede estar vacío.")
    @Size(min = 1, max = 8, message = "El id_roles debe tener una longitud de 1 a 8 dígitos.")
    private Long idroles;

    @Column(name = "nombre", columnDefinition = "VARCHAR(255)", nullable = false)
    @NotBlank(message = "'nombre' no puede estar vacío.")
    @Size(min = 4, max = 255, message = "El nombre del rol debe contener entre 4 y 255 caracteres.")
    private String nombre;


    // Creando los constructores de la clase
    public Roles() {

    }


    // Definiendo los getter y setter de "idroles"
    public Long getIdroles() {
        return idroles;
    }
    public void setIdroles(Long idroles) {
        this.idroles = idroles;
    }

    // Definiendo los getter y setter de "nombre"
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}