package com.acme.encuestas.domain.entities;

// Importando las clases y paquetes necesarios
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "user")
public class Users {
    // Creando las columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", columnDefinition = "INT UNSIGNED", nullable = false)
    @NotBlank(message = "'id_user' no puede estar vacío.")
    @Size(min = 1, max = 8, message = "El id_user debe tener una longitud de 1 a 8 dígitos.")
    private Long iduser;

    @Column(name = "activo", columnDefinition = "BOOLEAN", nullable = false)
    @NotNull(message = "'activo' es un booleano que requiere un valor obligatorio.")
    private boolean isActivo;

    @Column(name = "nombreusuario", columnDefinition = "VARCHAR(12)", nullable = false)
    @NotBlank(message = "'nombre_usuario' no puede estar vacío.")
    @Size(min = 2, max = 12, message = "La columna nombre_usuario debe tener entre 2 a 12 caracteres.")
    private String nombreUsuario;

    @Column(name = "contrasenya", columnDefinition = "VARCHAR(255)", nullable = false)
    @NotBlank(message = "'contraseña' no puede estar vacío.")
    @Size(min = 8, max = 255, message = "La columna contraseña debe tener entre 8 a 255 caracteres.")
    private String contrasenya;


    // Creando los constructores de la clase
    public Users() {

    }


    // Definiendo los getter y setter de "iduser"
    public Long getIduser() {
        return iduser;
    }
    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

    // Definiendo los getter y setter de "isActivo"
    public boolean isActivo() {
        return isActivo;
    }
    public void setActivo(boolean isActivo) {
        this.isActivo = isActivo;
    }

    // Definiendo los getter y setter de "nombreUsuario"
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    // Definiendo los getter y setter de "contrasenya"
    public String getContrasenya() {
        return contrasenya;
    }
    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }
}