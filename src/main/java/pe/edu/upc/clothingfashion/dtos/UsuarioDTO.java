package pe.edu.upc.clothingfashion.dtos;

import pe.edu.upc.clothingfashion.entities.Armario;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class UsuarioDTO {
    private int idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String direccionUsuario;
    private String tarjetaUsuario;
    private String telefonoUsuario;
    private String correo;
    private LocalDate fechaNacimiento;
    private String usuarioTag;
    private String contraseña;
    private Armario armario;
}
