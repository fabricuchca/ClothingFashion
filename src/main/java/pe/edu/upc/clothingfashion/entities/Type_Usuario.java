package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;

@Entity
@Table(name = "Type_Usuario")
public class Type_Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idType_Usuario;
    @Column(name = "nameTypeUsuario",nullable = false,length = 40)
    private String nameTypeUsuario;
    @Column(name = "typeUsuarioTag",nullable = false,length = 40)
    private String typeUsuarioTag;

    public Type_Usuario() {
    }

    public Type_Usuario(int idType_Usuario, String nameTypeUsuario, String typeUsuarioTag) {
        this.idType_Usuario = idType_Usuario;
        this.nameTypeUsuario = nameTypeUsuario;
        this.typeUsuarioTag = typeUsuarioTag;
    }

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
