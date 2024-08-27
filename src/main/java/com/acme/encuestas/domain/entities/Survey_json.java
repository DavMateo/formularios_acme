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
@Table(name = "encuesta_json")
public class Survey_json {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_encuesta_json", columnDefinition = "INT UNSIGNED", nullable = false)
    @NotBlank(message = "'id_encuesta_json' no puede estar vacío.")
    @Size(min = 1, max = 8, message = "El id_encuesta_json debe tener una longitud de 1 a 8 dígitos.")
    private Long idencuestajson;

    @Column(name = "creado_en", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'creado_en' no puede ser nulo, ingrese información.")
    @PastOrPresent(message = "La fecha debe ser una actual o pasada, no se permite fechas futuras.")
    private LocalDateTime creadoen;

    @Column(name = "actualizado_en", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'actualizado_en' no puede ser nulo, ingrese información.")
    @PastOrPresent(message = "La fecha debe ser una actual o pasada, no se permite fechas futuras.")
    private LocalDateTime actualizadoen;

    @Column(name = "payload", columnDefinition = "JSON", nullable = false)
    @NotBlank(message = "'payload' no puede estar vacío.")
    private Object payload;

    @ManyToOne
    @JoinColumn(name = "encuesta_id", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'encuesta_id' no puede ser nulo, ingrese información.")
    private Surveys surveys;


    // Creando los constructores de la clase
    public Survey_json() {

    }


    // Definiendo los getter y setter de "idencuestajson"
    public Long getIdencuestajson() {
        return idencuestajson;
    }
    public void setIdencuestajson(Long idencuestajson) {
        this.idencuestajson = idencuestajson;
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

    // Definiendo los getter y setter de "payload"
    public Object getPayload() {
        return payload;
    }
    public void setPayload(Object payload) {
        this.payload = payload;
    }

    // Definiendo los getter y setter de "surveys"
    public Surveys getSurveys() {
        return surveys;
    }
    public void setSurveys(Surveys surveys) {
        this.surveys = surveys;
    }
}