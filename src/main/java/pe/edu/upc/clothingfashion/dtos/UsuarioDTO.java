package pe.edu.upc.clothingfashion.dtos;

import pe.edu.upc.clothingfashion.entities.Closet;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class UsuarioDTO {
    private int idUsuario;
    private String nameUsuario;
    private String lastNameUsuario;
    private String addressUsuario;
    private String cardUsuario;
    private String telephoneUsuario;
    private String mail;
    private LocalDate birthDate;
    private String usuarioTag;
    private String passwordUsuario;
    private Closet closet;
}
