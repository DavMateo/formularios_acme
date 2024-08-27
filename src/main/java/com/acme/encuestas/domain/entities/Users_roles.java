package com.acme.encuestas.domain.entities;

// Importando las clases y paquetes necesarios
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users_roles")
public class Users_roles {
    // Creando las columnas de la tabla con sus claves forágneas
    @Id
    @ManyToOne
    @JoinColumn(name = "rol_id", columnDefinition = "INT UNSIGNED", nullable = false)
    @NotNull(message = "'rol_id' no puede ser nulo, ingrese información.")
    @Size(min = 1, max = 8, message = "El rol_id debe contener entre 1 a 8 dígitos.")
    private Roles roles;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", columnDefinition = "INT UNSIGNED", nullable = false)
    @NotNull(message = "'user_id' no puede ser nulo, ingrese información.")
    @Size(min = 1, max = 8, message = "El user_id debe contener entre 1 a 8 dígitos.")
    private Users users;


    // Creando los constructores de la clase
    public Users_roles() {

    }


    // Definiendo los getter y setter de "roles"
    public Roles getRoles() {
        return roles;
    }
    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    // Definiendo los getter y setter de "users"
    public Users getUsers() {
        return users;
    }
    public void setUsers(Users users) {
        this.users = users;
    }
}