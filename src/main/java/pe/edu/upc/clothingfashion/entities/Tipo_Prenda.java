package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;

@Entity
@Table(name="TipoPrenda")
public class Tipo_Prenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoPrenda;
    @Column(name="nombreTipoPrenda",nullable = false,length = 50)
    private String nombreTipoPrenda;
    @Column(name="talla",nullable = false,length = 30)
    private String talla;
    @Column(name="genero",nullable = false,length = 30)
    private String genero;
    @Column(name="descripcion",nullable = false,length = 60)
    private String descripcion;
    @Column(name="categoria",nullable = false,length = 30)
    private String categoria;
    @Column(name="ocasion",nullable = false,length = 30)
    private String ocasion;

    public Tipo_Prenda() {
    }

    public Tipo_Prenda(int idTipoPrenda, String nombreTipoPrenda, String talla, String genero, String descripcion, String categoria, String ocasion) {
        this.idTipoPrenda = idTipoPrenda;
        this.nombreTipoPrenda = nombreTipoPrenda;
        this.talla = talla;
        this.genero = genero;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.ocasion = ocasion;
    }

    public int getIdTipoPrenda() {
        return idTipoPrenda;
    }

    public void setIdTipoPrenda(int idTipoPrenda) {
        this.idTipoPrenda = idTipoPrenda;
    }

    public String getNombreTipoPrenda() {
        return nombreTipoPrenda;
    }

    public void setNombreTipoPrenda(String nombreTipoPrenda) {
        this.nombreTipoPrenda = nombreTipoPrenda;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getOcasion() {
        return ocasion;
    }

    public void setOcasion(String ocasion) {
        this.ocasion = ocasion;
    }

}
