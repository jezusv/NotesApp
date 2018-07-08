package com.example.jatuncar.notesapp.models;

import com.orm.dsl.Table;

@Table
public class Notes {
    private Long id;
    private Long id_user;
    private String titulo;
    private String contenido;

    public Notes() {
    }

    public Notes(Long id_user, String titulo, String contenido) {
        this.id_user = id_user;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    @Override
    public String toString() {

        return "Notes{" +
                "id=" + id +
                ", id_user=" + id_user +
                ", titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
