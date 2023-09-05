package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;

@Entity
@Table
public class Recomendaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecomendaciones;
    @Column(name = "titulo",nullable = false,length = 50)
    private String titulo;
    @Column(name = "autor",nullable = false,length = 40)
    private String autor;
    @Column(name = "calificacion",nullable = false,length = 1)
    private int calificacion;
    @Column(name = "enlaceAdicional",nullable = false,length = 1000)
    private String enlaceAdicional;
    @Column(name = "etiquetaCategoria",nullable = false,length = 50)
    private String etiquetaCategoria;

    public Recomendaciones() {
    }

    public Recomendaciones(int idRecomendaciones, String titulo, String autor, int calificacion, String enlaceAdicional, String etiquetaCategoria) {
        this.idRecomendaciones = idRecomendaciones;
        this.titulo = titulo;
        this.autor = autor;
        this.calificacion = calificacion;
        this.enlaceAdicional = enlaceAdicional;
        this.etiquetaCategoria = etiquetaCategoria;
    }

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
