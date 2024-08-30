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
@Table(name = "preguntas")
public class Questions {
    // Creando las columnas de la tabla con sus claves forágneas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pregunta", columnDefinition = "INT UNSIGNED", nullable = false)
    @NotBlank(message = "'id_pregunta' no puede estar vacío.")
    @Size(min = 1, max = 8, message = "El id_capitulo debe tener una longitud de 1 a 8 dígitos.")
    private Long idpregunta;

    // Embeber elementos DATETIME
    @Column(name = "creado_en", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'creado_en' no puede ser nulo, ingrese información.")
    @PastOrPresent(message = "La fecha debe ser una actual o pasada, no se permite fechas futuras.")
    private LocalDateTime creadoen;

    @Column(name = "actualizado_en", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'actualizado_en' no puede ser nulo, ingrese información.")
    @PastOrPresent(message = "La fecha debe ser una actual o pasada, no se permite fechas futuras.")
    private LocalDateTime actualizadoen;

    @Column(name = "numero_pregunta", columnDefinition = "VARCHAR(10)", nullable = false)
    @NotBlank(message = "'numero_pregunta' no puede estar vacío.")
    @Size(min = 1, max = 10, message = "El numero_pregunta debe tener una longitud de 1 a 10 dígitos.")
    private String numeropregunta;

    @Column(name = "tipo_respuesta", columnDefinition = "VARCHAR(20)", nullable = false)
    @NotBlank(message = "'tipo_respuesta' no puede estar vacío.")
    @Size(min = 4, max = 20, message = "El tipo_respuesta debe tener una longitud de 4 a 20 caracteres.")
    private String tiporespuesta;

    @Column(name = "comentario_pregunta", columnDefinition = "TEXT", nullable = true)
    @Size(min = 10, message = "El comentario_pregunta debe tener una longitud mínima de 10 caracteres.")
    private String comentariopregunta;

    @Column(name = "enunciado", columnDefinition = "TEXT", nullable = false)
    @NotBlank(message = "'enunciado' no puede estar vacío.")
    @Size(min = 10, message = "El enunciado debe tener una longitud mínima de 10 caracteres.")
    private String enunciado;

    @ManyToOne
    @JoinColumn(name = "id_capitulo", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_capitulo' no puede ser nulo, ingrese información.")
    private Chapter chapter;


    // Creando los constructores de la clase
    public Questions() {

    }


    // Definiendo los getter y setter de "idpregunta"
    public Long getIdpregunta() {
        return idpregunta;
    }
    public void setIdpregunta(Long idpregunta) {
        this.idpregunta = idpregunta;
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

    // Definiendo los getter y setter de "numeropregunta"
    public String getNumeropregunta() {
        return numeropregunta;
    }
    public void setNumeropregunta(String numeropregunta) {
        this.numeropregunta = numeropregunta;
    }

    // Definiendo los getter y setter de "tiporespuesta"
    public String getTiporespuesta() {
        return tiporespuesta;
    }
    public void setTiporespuesta(String tiporespuesta) {
        this.tiporespuesta = tiporespuesta;
    }

    // Definiendo los getter y setter de "comentariopregunta"
    public String getComentariopregunta() {
        return comentariopregunta;
    }
    public void setComentariopregunta(String comentariopregunta) {
        this.comentariopregunta = comentariopregunta;
    }

    // Definiendo los getter y setter de "enunciado"
    public String getEnunciado() {
        return enunciado;
    }
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    // Definiendo los getter y setter de "chapter"
    public Chapter getChapter() {
        return chapter;
    }
    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }
}