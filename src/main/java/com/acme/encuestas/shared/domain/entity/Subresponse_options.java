package com.acme.encuestas.shared.domain.entity;

// Importando las clases y paquetes necesarios
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "opciones_subrespuesta")
public class Subresponse_options {
    // Creando las columnas de la tabla con sus claves forágneas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_opcion_subrespuesta", columnDefinition = "INT UNSIGNED", nullable = false)
    private Long idopcionsubrespuesta;

    @Column(name = "numero_subrespuesta", columnDefinition = "INT UNSIGNED", nullable = false)
    @NotBlank(message = "'numero_subrespuesta' no puede estar vacío.")
    @Size(min = 1, max = 4, message = "El numero_subrespuesta debe tener una longitud de 1 a 4 dígitos.")
    private int numerosubrespuesta;

    // Embeber elementos DATETIME
    @Column(name = "creado_en", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'creado_en' no puede ser nulo, ingrese información.")
    @PastOrPresent(message = "La fecha debe ser una actual o pasada, no se permite fechas futuras.")
    private LocalDateTime creadoen;

    @Column(name = "actualizado_en", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'actualizado_en' no puede ser nulo, ingrese información.")
    @PastOrPresent(message = "La fecha debe ser una actual o pasada, no se permite fechas futuras.")
    private LocalDateTime actualizadoen;

    @Column(name = "componente_html", columnDefinition = "VARCHAR(255)", nullable = false)
    @NotBlank(message = "'componente_html' no puede estar vacío.")
    @Size(min = 3, max = 255, message = "El componente_html debe tener una longitud de 3 a 5 caracteres.")
    private String componentehtml;

    @Column(name = "texto_subrespuesta", columnDefinition = "VARCHAR(255)", nullable = false)
    @NotBlank(message = "'texto_subrespuesta' no puede estar vacío.")
    @Size(min = 10, max = 255, message = "El texto_subrespuesta debe tener una longitud de 10 a 255 caracteres.")
    private String textosubrespuesta;

    @ManyToOne
    @JoinColumn(name = "opciones_respuesta_id", columnDefinition = "INT UNSIGNED", nullable = false)
    @NotNull(message = "'opciones_respuesta_id' no puede ser nulo, ingrese información.")
    private Response_options responseoptions;


    // Creando los constructores de la clase
    public Subresponse_options() {

    }


    // Definiendo los getter y setter de "idopcionsubrespuesta"
    public Long getIdopcionsubrespuesta() {
        return idopcionsubrespuesta;
    }
    public void setIdopcionsubrespuesta(Long idopcionsubrespuesta) {
        this.idopcionsubrespuesta = idopcionsubrespuesta;
    }

    // Definiendo los getter y setter de "numerosubrespuesta"
    public int getNumerosubrespuesta() {
        return numerosubrespuesta;
    }
    public void setNumerosubrespuesta(int numerosubrespuesta) {
        this.numerosubrespuesta = numerosubrespuesta;
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

    // Definiendo los getter y setter de "componentehtml"
    public String getComponentehtml() {
        return componentehtml;
    }
    public void setComponentehtml(String componentehtml) {
        this.componentehtml = componentehtml;
    }

    // Definiendo los getter y setter de "textosubrespuesta"
    public String getTextosubrespuesta() {
        return textosubrespuesta;
    }
    public void setTextosubrespuesta(String textosubrespuesta) {
        this.textosubrespuesta = textosubrespuesta;
    }

    // Definiendo los getter y setter de "responseoptions"
    public Response_options getResponseoptions() {
        return responseoptions;
    }
    public void setResponseoptions(Response_options responseoptions) {
        this.responseoptions = responseoptions;
    }
}