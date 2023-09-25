package pe.edu.upc.clothingfashion.dtos;

import javax.persistence.Column;

public class Type_UsuarioDTO {
    private int idType_Usuario;
    private String nameTypeUsuario;
    private String typeUsuarioTag;

    public int getIdType_Usuario() {
        return idType_Usuario;
    }

    public void setIdType_Usuario(int idType_Usuario) {
        this.idType_Usuario = idType_Usuario;
    }

    public String getNameTypeUsuario() {
        return nameTypeUsuario;
    }

    public void setNameTypeUsuario(String nameTypeUsuario) {
        this.nameTypeUsuario = nameTypeUsuario;
    }

    public String getTypeUsuarioTag() {
        return typeUsuarioTag;
    }

    public void setTypeUsuarioTag(String typeUsuarioTag) {
        this.typeUsuarioTag = typeUsuarioTag;
    }
}
