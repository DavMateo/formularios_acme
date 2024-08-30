package com.acme.encuestas.shared.domain.entity;

// Importando las clases y paquetes necesarios
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
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "resuesta_pregunta")
public class Response_question {
    // Creando las columnas de la tabla con sus claves forágneas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_respuesta_pregunta", columnDefinition = "INT UNSIGNED", nullable = false)
    @NotBlank(message = "'id_respuesta_pregunta' no puede estar vacío.")
    @Size(min = 1, max = 8, message = "El id_respuesta_pregunta debe tener una longitud de 1 a 8 dígitos.")
    private Long idrespuestapregunta;

    @Column(name = "respuesta_texto", columnDefinition = "VARCHAR(80)", nullable = false)
    @NotBlank(message = "'respuesta_texto' no puede estar vacío.")
    @Size(min = 10, max = 80, message = "La respuesta_texto debe tener una longitud de 10 a 80 caracteres.")
    private String respuestatexto;

    @ManyToOne
    @JoinColumn(name = "opciones_respuesta_id", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'opciones_respuesta_id' no puede ser nulo, ingrese información.")
    private Response_options responseoptions;

    @ManyToOne
    @JoinColumn(name = "opcion_subrespuesta_id", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'opcion_subrespuesta_id' no puede ser nulo, ingrese información.")
    private Subresponse_options subresponseoptions;


    // Creando los constructores de la clase
    public Response_question() {

    }


    // Definiendo los getter y setter de "idrespuestapregunta"
    public Long getIdrespuestapregunta() {
        return idrespuestapregunta;
    }
    public void setIdrespuestapregunta(Long idrespuestapregunta) {
        this.idrespuestapregunta = idrespuestapregunta;
    }

    // Definiendo los getter y setter de "respuestatexto"
    public String getRespuestatexto() {
        return respuestatexto;
    }
    public void setRespuestatexto(String respuestatexto) {
        this.respuestatexto = respuestatexto;
    }

    // Definiendo los getter y setter de "responseoptions"
    public Response_options getResponseoptions() {
        return responseoptions;
    }
    public void setResponseoptions(Response_options responseoptions) {
        this.responseoptions = responseoptions;
    }

    // Definiendo los getter y setter de "subresponseoptions"
    public Subresponse_options getSubresponseoptions() {
        return subresponseoptions;
    }
    public void setSubresponseoptions(Subresponse_options subresponseoptions) {
        this.subresponseoptions = subresponseoptions;
    }
}