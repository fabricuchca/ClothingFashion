package pe.edu.upc.clothingfashion.dtos;

import javax.persistence.Column;

public class Tipo_UsuarioDTO {
    private int idTipo_Usuario;
    private String nombreTipoUsuario;
    private String tipoUsuarioTag;

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
