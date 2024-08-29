package com.acme.encuestas.domain.dto;

public class UserDTO {
    private Long iduser;
    private boolean isActivo;
    private String nombreusuario;
    private String contrasenya;
    public UserDTO() {
    }
    public UserDTO(Long iduser, boolean isActivo, String nombreusuario, String contrasenya) {
        this.iduser = iduser;
        this.isActivo = isActivo;
        this.nombreusuario = nombreusuario;
        this.contrasenya = contrasenya;
    }
    public Long getIduser() {
        return iduser;
    }
    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }
    public boolean isActivo() {
        return isActivo;
    }
    public void setActivo(boolean isActivo) {
        this.isActivo = isActivo;
    }
    public String getNombreusuario() {
        return nombreusuario;
    }
    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }
    public String getContrasenya() {
        return contrasenya;
    }
    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    
}
