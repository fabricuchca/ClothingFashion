package pe.edu.upc.clothingfashion.dtos;
public class ColorDTO {
    private  int idColor;
    private String nombreColor;
    private String descripcion;
    private String tipoColor;

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
