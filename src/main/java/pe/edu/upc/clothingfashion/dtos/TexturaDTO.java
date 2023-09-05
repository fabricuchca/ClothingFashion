package pe.edu.upc.clothingfashion.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class TexturaDTO {
    private int idTextura;
    private String nombreTextura;
    private LocalDate fechaCreacion;
    private String material;

    public int getIdTextura() {
        return idTextura;
    }

    public void setIdTextura(int idTextura) {
        this.idTextura = idTextura;
    }

    public String getNombreTextura() {
        return nombreTextura;
    }

    public void setNombreTextura(String nombreTextura) {
        this.nombreTextura = nombreTextura;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
