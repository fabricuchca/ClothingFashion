package pe.edu.upc.clothingfashion.dtos;

import pe.edu.upc.clothingfashion.entities.Catalogo;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class OutfitDTO {
    private int idOutfit;
    private String nombreOutfit;
    private String estiloOutfit;
    private int cantidadPrendas;
    private LocalDate fechaCreacion;
    private Catalogo catalogo;

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
