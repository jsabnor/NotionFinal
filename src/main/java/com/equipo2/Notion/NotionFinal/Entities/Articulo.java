package com.equipo2.Notion.NotionFinal.Entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="articulos")
public class Articulo {

    //ATRIBUTOS
    private Long id;
    private Usuario autor;
    private LocalDate fechaCreacion;
    private String titulo;
    private String contenido;
    private Categoria categoria;

    //CONSTRUCTORES

    /**
     * Constructor con todos los parametros
     * @param id Clave primaria de la tabla
     * @param autor usuario que crea el articulo
     * @param fechaCreacion fecha de creacion del articulo
     * @param titulo del articulo
     * @param contenido del articulo
     * @param categoria del articulo
     */
    public Articulo(Long id, Usuario autor, LocalDate fechaCreacion, String titulo, String contenido, Categoria categoria) {
        this.id = id;
        this.autor = autor;
        this.fechaCreacion = fechaCreacion;
        this.titulo = titulo;
        this.contenido = contenido;
        this.categoria= categoria;
    }

    //METODOS

    //GETTER Y SETTER


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
