package pe.edu.upc.clothingfashion.entities;
import javax.persistence.*;

@Entity
@Table(name = "Color")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idColor;
    @Column(name = "nombreColor",nullable = false,length = 20)
    private String nombreColor;
    @Column(name = "descripcion",nullable = false,length = 40)
    private String descripcion;
    @Column(name = "tipoColor",nullable = false,length = 40)
    private String tipoColor;
    public Color() {
    }

    public Color(int idColor, String nombreColor, String descripcion, String tipoColor) {
        this.idColor = idColor;
        this.nombreColor = nombreColor;
        this.descripcion = descripcion;
        this.tipoColor = tipoColor;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public String getNombreColor() {
        return nombreColor;
    }

    public void setNombreColor(String nombreColor) {
        this.nombreColor = nombreColor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoColor() {
        return tipoColor;
    }

    public void setTipoColor(String tipoColor) {
        this.tipoColor = tipoColor;
    }
}
