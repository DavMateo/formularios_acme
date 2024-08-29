package com.acme.encuestas.domain.dto;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.acme.encuestas.domain.entities.Roles;

public class UserRolesDTO {
    private Roles roles;
    private User users;
    
    public UserRolesDTO() {
    }
    public UserRolesDTO(Roles roles, User users) {
        this.roles = roles;
        this.users = users;
    }
    public Roles getRoles() {
        return roles;
    }
    public void setRoles(Roles roles) {
        this.roles = roles;
    }
    public User getUsers() {
        return users;
    }
    public void setUsers(User users) {
        this.users = users;
    }
    
    
}
