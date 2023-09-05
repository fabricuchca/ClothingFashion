package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nombreUsuario",nullable = false,length = 40)
    private String nombreUsuario;
    @Column(name = "apellidoUsuario",nullable = false,length = 40)
    private String apellidoUsuario;
    @Column(name = "direccionUsuario",nullable = false,length = 80)
    private String direccionUsuario;
    @Column(name = "tarjetaUsuario",nullable = false,length = 16)
    private String tarjetaUsuario;
    @Column(name = "telefonoUsuario",nullable = false,length = 9)
    private String telefonoUsuario;
    @Column(name = "correo",nullable = false,length = 40)
    private String correo;
    @Column(name = "fechaNacimiento",nullable = false)
    private LocalDate fechaNacimiento;
    @Column(name = "usuarioTag",nullable = false,length = 20)
    private String usuarioTag;
    @Column(name = "contraseña",nullable = false,length = 40)
    private String contraseña;
    @ManyToOne
    @JoinColumn
    private Armario armario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String apellidoUsuario, String direccionUsuario, String tarjetaUsuario, String telefonoUsuario, String correo, LocalDate fechaNacimiento, String usuario, String contraseña, Armario armario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.direccionUsuario = direccionUsuario;
        this.tarjetaUsuario = tarjetaUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.usuarioTag = usuario;
        this.contraseña = contraseña;
        this.armario = armario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getDireccionUsuario() {
        return direccionUsuario;
    }

    public void setDireccionUsuario(String direccionUsuario) {
        this.direccionUsuario = direccionUsuario;
    }

    public String getTarjetaUsuario() {
        return tarjetaUsuario;
    }

    public void setTarjetaUsuario(String tarjetaUsuario) {
        this.tarjetaUsuario = tarjetaUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getUsuario() {
        return usuarioTag;
    }

    public void setUsuario(String usuario) {
        this.usuarioTag = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Armario getArmario() {
        return armario;
    }

    public void setArmario(Armario armario) {
        this.armario = armario;
    }
}
