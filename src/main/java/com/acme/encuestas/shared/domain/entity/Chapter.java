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
@Table(name = "capitulo")
public class Chapter {
    // Creando las columnas de la tabla con sus claves forágneas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_capitulo", columnDefinition = "INT UNSIGNED", nullable = false)
    @NotBlank(message = "'id_capitulo' no puede estar vacío.")
    @Size(min = 1, max = 8, message = "El id_capitulo debe tener una longitud de 1 a 8 dígitos.")
    private Long idcapitulo;

    // Embeber elementos DATETIME
    @Column(name = "creado_en", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'creado_en' no puede ser nulo, ingrese información.")
    @PastOrPresent(message = "La fecha debe ser una actual o pasada, no se permite fechas futuras.")
    private LocalDateTime creadoen;

    @Column(name = "actualizado_en", columnDefinition = "DATETIME", nullable = false)
    @NotNull(message = "'actualizado_en' no puede ser nulo, ingrese información.")
    @PastOrPresent(message = "La fecha debe ser una actual o pasada, no se permite fechas futuras.")
    private LocalDateTime actualizadoen;

    @Column(name = "numero_capitulo", columnDefinition = "VARCHAR(50)", nullable = false)
    @NotBlank(message = "'numero_capitulo' no puede estar vacío.")
    @Size(min = 1, max = 50, message = "El numero_capitulo debe tener una longitud de 1 a 50 caracteres.")
    private String numerocapitulo;

    @Column(name = "titulo_capitulo", columnDefinition = "VARCHAR(50)", nullable = false)
    @NotBlank(message = "'titulo_capitulo' no puede estar vacío.")
    @Size(min = 4, max = 50, message = "El titulo_capitulo debe tener una longitud de 4 a 50 caracteres.")
    private String titulocapitulo;

    @ManyToOne
    @JoinColumn(name = "id_encuesta", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "'id_encuesta' no puede ser nulo, ingrese información.")
    private Surveys surveys;


    // Creando los constructores de la clase
    public Chapter() {

    }


    // Definiendo los getter y setter de "idcapitulo"
    public Long getIdcapitulo() {
        return idcapitulo;
    }
    public void setIdcapitulo(Long idcapitulo) {
        this.idcapitulo = idcapitulo;
    }

    // Definiendo los getter y setter de "creadoen"
    public LocalDateTime getCreadoen() {
        return creadoen;
    }
    public void setCreadoen(LocalDateTime creadoen) {
        this.creadoen = creadoen;
    }

    // Definiendo los getter y setter de "actualizado_en"
    public LocalDateTime getActualizadoen() {
        return actualizadoen;
    }
    public void setActualizadoen(LocalDateTime actualizadoen) {
        this.actualizadoen = actualizadoen;
    }

    // Definiendo los getter y setter de "numerocapitulo"
    public String getNumerocapitulo() {
        return numerocapitulo;
    }
    public void setNumerocapitulo(String numerocapitulo) {
        this.numerocapitulo = numerocapitulo;
    }

    // Definiendo los getter y setter de "titulocapitulo"
    public String getTitulocapitulo() {
        return titulocapitulo;
    }
    public void setTitulocapitulo(String titulocapitulo) {
        this.titulocapitulo = titulocapitulo;
    }

    // Definiendo los getter y setter de "surveys"
    public Surveys getSurveys() {
        return surveys;
    }
    public void setSurveys(Surveys surveys) {
        this.surveys = surveys;
    }
}