package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;

@Entity
@Table(name = "Tienda")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTienda;
    @Column(name = "nombreTienda",nullable = false,length = 20)
    private String nombreTienda;
    @Column(name = "direccionTienda",nullable = false,length = 50)
    private String direccionTienda;
    @Column(name = "telefonoTienda",nullable = false,length = 9)
    private String telefonoTienda;
    @Column(name = "codigoPostal",nullable = false,length = 20)
    private String codigoPostal;
    @Column(name = "metodoPago",nullable = false,length = 20)
    private String metodoPago;
    @Column(name = "latitud",nullable = false,length = 10)
    private String latitud;
    @Column(name = "longitud",nullable = false,length = 10)
    private String longitud;
    @ManyToOne
    @JoinColumn
    private Catalogo catalogo;

    public Tienda() {
    }

    public Tienda(int idTienda, String nombreTienda, String direccionTienda, String telefonoTienda, String codigoPostal, String metodoPago, String latitud, String longitud, Catalogo catalogo) {
        this.idTienda = idTienda;
        this.nombreTienda = nombreTienda;
        this.direccionTienda = direccionTienda;
        this.telefonoTienda = telefonoTienda;
        this.codigoPostal = codigoPostal;
        this.metodoPago = metodoPago;
        this.latitud = latitud;
        this.longitud = longitud;
        this.catalogo = catalogo;
    }

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    public String getTelefonoTienda() {
        return telefonoTienda;
    }

    public void setTelefonoTienda(String telefonoTienda) {
        this.telefonoTienda = telefonoTienda;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }
}
