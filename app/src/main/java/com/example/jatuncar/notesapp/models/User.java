package com.example.jatuncar.notesapp.models;

import com.orm.dsl.Table;

@Table
public class User {

    private Long id ;
    private String usuario;
    private String nombres_completos;
    private String correo_electronico;
    private String contrasena;

    public User() {
    }

    public User( String usuario, String nombres_completos, String correo_electronico, String contrasena) {
        this.usuario = usuario;
        this.nombres_completos = nombres_completos;
        this.correo_electronico = correo_electronico;
        this.contrasena = contrasena;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombres_completos() {
        return nombres_completos;
    }

    public void setNombres_completos(String nombres_completos) {
        this.nombres_completos = nombres_completos;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getcontrasena() {
        return contrasena;
    }

    public void setContraseña(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", nombres_completos='" + nombres_completos + '\'' +
                ", correo_electronico='" + correo_electronico + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}
