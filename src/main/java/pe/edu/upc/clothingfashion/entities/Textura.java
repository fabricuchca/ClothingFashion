package pe.edu.upc.clothingfashion.entities;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Textura")
public class Textura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTextura;
    @Column(name = "nombreTextura",nullable = false,length = 20)
    private String nombreTextura;
    @Column(name = "fechaCreacion",nullable = false)
    private LocalDate fechaCreacion;
    @Column(name = "material",nullable = false,length = 20)
    private String material;
    public Textura() {
    }
    public Textura(int idTextura, String nombreTextura, LocalDate fechaCreacion, String material) {
        this.idTextura = idTextura;
        this.nombreTextura = nombreTextura;
        this.fechaCreacion = fechaCreacion;
        this.material = material;
    }
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
