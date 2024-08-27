package com.acme.encuestas.domain.entities;

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
@Table(name = "opciones_respuesta")
public class Response_options {
    // Creando las columnas de la tabla con sus claves forágneas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_opciones_respuesta", columnDefinition = "INT UNSIGNED", nullable = false)
    @NotBlank(message = "'id_opciones_respuesta' no puede estar vacío.")
    @Size(min = 1, max = 8, message = "El id_opciones_respuesta debe tener una longitud de 1 a 8 dígitos.")
    private Long idopcionesrespuesta;

    @Column(name = "opcion_valor", columnDefinition = "VARCHAR(10)", nullable = false)
    @NotBlank(message = "'opcion_valor' no puede estar vacío.")
    @Size(min = 1, max = 10, message = "La opcion_valor debe tener una longitud de 1 a 10 caracteres.")
    private String opcionvalor;

    // Embeber elementos DATETIME
    @Column(name = "creado_en", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'creado_en' no puede ser nulo, ingrese información.")
    @PastOrPresent(message = "La fecha debe ser una actual o pasada, no se permite fechas futuras.")
    private LocalDateTime creadoen;

    @Column(name = "actualizado_en", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'actualizado_en' no puede ser nulo, ingrese información.")
    @PastOrPresent(message = "La fecha debe ser una actual o pasada, no se permite fechas futuras.")
    private LocalDateTime actualizadoen;

    @Column(name = "tipo_componente_html", columnDefinition = "VARCHAR(30)", nullable = false)
    @NotBlank(message = "'tipo_componente_html' no puede estar vacío.")
    @Size(min = 1, max = 30, message = "El tipo_componente_html debe tener una longitud de 1 a 30 caracteres.")
    private String tipocomponentehtml;

    @Column(name = "comentario_respuesta", columnDefinition = "TEXT", nullable = false)
    @NotBlank(message = "'comentario_respuesta' no puede estar vacío.")
    @Size(min = 15, message = "El comentario_respuesta debe tener una longitud mínima de 15 caracteres.")
    private String comentariorespuesta;

    @Column(name = "texto_opcion", columnDefinition = "TEXT", nullable = false)
    @NotBlank(message = "'texto_opcion' no puede estar vacío.")
    @Size(min = 10, message = "El texto_opcion debe tener una longitud mínima de 10 caracteres")
    private String textoopcion;

    @ManyToOne
    @JoinColumn(name = "catalogo_categoria_id", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'catalogo_categoria_id' no puede ser nulo, ingrese información.")
    private Categories_catalog categoriescatalog;

    @ManyToOne
    @JoinColumn(name = "respuesta_padre_id", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'respuesta_padre_id' no puede ser nulo, ingrese información.")
    private Response_options response_options;

    @ManyToOne
    @JoinColumn(name = "pregunta_id", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'pregunta_id' no puede ser nulo, ingrese información.")
    private Questions questions;


    // Creando los constructores de la clase
    public Response_options() {

    }


    // Definiendo los getter y setter de "idopcionesrespuesta"
    public Long getIdopcionesrespuesta() {
        return idopcionesrespuesta;
    }
    public void setIdopcionesrespuesta(Long idopcionesrespuesta) {
        this.idopcionesrespuesta = idopcionesrespuesta;
    }

    // Definiendo los getter y setter de "opcionvalor"
    public String getOpcionvalor() {
        return opcionvalor;
    }
    public void setOpcionvalor(String opcionvalor) {
        this.opcionvalor = opcionvalor;
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

    // Definiendo los getter y setter de "tipocomponentehtml"
    public String getTipocomponentehtml() {
        return tipocomponentehtml;
    }
    public void setTipocomponentehtml(String tipocomponentehtml) {
        this.tipocomponentehtml = tipocomponentehtml;
    }

    // Definiendo los getter y setter de "comentariorespuesta"
    public String getComentariorespuesta() {
        return comentariorespuesta;
    }
    public void setComentariorespuesta(String comentariorespuesta) {
        this.comentariorespuesta = comentariorespuesta;
    }

    // Definiendo los getter y setter de "textoopcion"
    public String getTextoopcion() {
        return textoopcion;
    }
    public void setTextoopcion(String textoopcion) {
        this.textoopcion = textoopcion;
    }

    // Definiendo los getter y setter de "categoriescatalog"
    public Categories_catalog getCategoriescatalog() {
        return categoriescatalog;
    }
    public void setCategoriescatalog(Categories_catalog categoriescatalog) {
        this.categoriescatalog = categoriescatalog;
    }

    // Definiendo los getter y setter de "response_options"
    public Response_options getResponse_options() {
        return response_options;
    }
    public void setResponse_options(Response_options response_options) {
        this.response_options = response_options;
    }

    // Definiendo los getter y setter de "questions"
    public Questions getQuestions() {
        return questions;
    }
    public void setQuestions(Questions questions) {
        this.questions = questions;
    }
}