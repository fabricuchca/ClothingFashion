package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;

@Entity
@Table(name="Marca")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMarca;
    @Column(name="nombreMarca",nullable = false,length = 40)
    private String nombreMarca;
    @Column(name="pais",nullable = false,length = 55)
    private String pais;
    @Column(name="sitioWeb",nullable = false,length = 60)
    private String sitioWeb;
    @Column(name="descripcion",nullable = false,length = 60)
    private String descripcion;
    @Column(name="etiquetas",nullable = false,length = 50)
    private String etiquetas;

    public Marca() {
    }

    public Marca(int idMarca, String nombreMarca, String pais, String sitioWeb, String descripcion, String etiquetas) {
        this.idMarca = idMarca;
        this.nombreMarca = nombreMarca;
        this.pais = pais;
        this.sitioWeb = sitioWeb;
        this.descripcion = descripcion;
        this.etiquetas = etiquetas;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }
}
