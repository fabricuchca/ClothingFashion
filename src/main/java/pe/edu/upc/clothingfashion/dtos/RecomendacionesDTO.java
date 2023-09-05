package pe.edu.upc.clothingfashion.dtos;

import javax.persistence.Column;

public class RecomendacionesDTO {
    private int idRecomendaciones;
    private String titulo;
    private String autor;
    private int calificacion;
    private String enlaceAdicional;
    private String etiquetaCategoria;

    public int getIdRecomendaciones() {
        return idRecomendaciones;
    }

    public void setIdRecomendaciones(int idRecomendaciones) {
        this.idRecomendaciones = idRecomendaciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getEnlaceAdicional() {
        return enlaceAdicional;
    }

    public void setEnlaceAdicional(String enlaceAdicional) {
        this.enlaceAdicional = enlaceAdicional;
    }

    public String getEtiquetaCategoria() {
        return etiquetaCategoria;
    }

    public void setEtiquetaCategoria(String etiquetaCategoria) {
        this.etiquetaCategoria = etiquetaCategoria;
    }
}
