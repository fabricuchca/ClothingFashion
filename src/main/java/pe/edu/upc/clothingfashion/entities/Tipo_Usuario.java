package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;

@Entity
@Table(name = "Tipo_Usuario")
public class Tipo_Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipo_Usuario;
    @Column(name = "nombreTipoUsuario",nullable = false,length = 40)
    private String nombreTipoUsuario;
    @Column(name = "tipoUsuarioTag",nullable = false,length = 40)
    private String tipoUsuarioTag;

    public Tipo_Usuario() {
    }

    public Tipo_Usuario(int idTipo_Usuario, String nombreTipoUsuario, String tipoUsuarioTag) {
        this.idTipo_Usuario = idTipo_Usuario;
        this.nombreTipoUsuario = nombreTipoUsuario;
        this.tipoUsuarioTag = tipoUsuarioTag;
    }

    public int getIdTipo_Usuario() {
        return idTipo_Usuario;
    }

    public void setIdTipo_Usuario(int idTipo_Usuario) {
        this.idTipo_Usuario = idTipo_Usuario;
    }

    public String getNombreTipoUsuario() {
        return nombreTipoUsuario;
    }

    public void setNombreTipoUsuario(String nombreTipoUsuario) {
        this.nombreTipoUsuario = nombreTipoUsuario;
    }

    public String getTipoUsuarioTag() {
        return tipoUsuarioTag;
    }

    public void setTipoUsuarioTag(String tipoUsuarioTag) {
        this.tipoUsuarioTag = tipoUsuarioTag;
    }
}
