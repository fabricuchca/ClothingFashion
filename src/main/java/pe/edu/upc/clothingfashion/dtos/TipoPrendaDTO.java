package pe.edu.upc.clothingfashion.dtos;

public class TipoPrendaDTO {
    private int idTipoPrenda;
    private String nombreTipoPrenda;
    private String talla;
    private String genero;
    private String descripcion;
    private String categoria;
    private String ocasion;

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
