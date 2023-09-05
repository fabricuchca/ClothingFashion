package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Outfit")
public class Outfit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOutfit;
    @Column(name = "nombreOutfit",nullable = false,length = 50)
    private String nombreOutfit;
    @Column(name = "estiloOutfit",nullable = false,length = 50)
    private String estiloOutfit;
    @Column(name = "cantidadPrendas",nullable = false,length = 2)
    private int cantidadPrendas;
    @Column(name = "fechaCreacion",nullable = false)
    private LocalDate fechaCreacion;
    @ManyToOne
    @JoinColumn
    private Catalogo catalogo;

    public Outfit() {
    }

    public Outfit(int idOutfit, String nombreOutfit, String estiloOutfit, int cantidadPrendas, LocalDate fechaCreacion, Catalogo catalogo) {
        this.idOutfit = idOutfit;
        this.nombreOutfit = nombreOutfit;
        this.estiloOutfit = estiloOutfit;
        this.cantidadPrendas = cantidadPrendas;
        this.fechaCreacion = fechaCreacion;
        this.catalogo = catalogo;
    }

    public int getIdOutfit() {
        return idOutfit;
    }

    public void setIdOutfit(int idOutfit) {
        this.idOutfit = idOutfit;
    }

    public String getNombreOutfit() {
        return nombreOutfit;
    }

    public void setNombreOutfit(String nombreOutfit) {
        this.nombreOutfit = nombreOutfit;
    }

    public String getEstiloOutfit() {
        return estiloOutfit;
    }

    public void setEstiloOutfit(String estiloOutfit) {
        this.estiloOutfit = estiloOutfit;
    }

    public int getCantidadPrendas() {
        return cantidadPrendas;
    }

    public void setCantidadPrendas(int cantidadPrendas) {
        this.cantidadPrendas = cantidadPrendas;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }
}
