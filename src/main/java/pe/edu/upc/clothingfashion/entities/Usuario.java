package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nameUsuario",nullable = false,length = 40)
    private String nameUsuario;
    @Column(name = "lastNameUsuario",nullable = false,length = 40)
    private String lastNameUsuario;
    @Column(name = "addressUsuario",nullable = false,length = 80)
    private String addressUsuario;
    @Column(name = "cardUsuario",nullable = false,length = 16)
    private String cardUsuario;
    @Column(name = "telephoneUsuario",nullable = false,length = 9)
    private String telephoneUsuario;
    @Column(name = "mail",nullable = false,length = 40)
    private String mail;
    @Column(name = "birthDate",nullable = false)
    private LocalDate birthDate;
    @Column(name = "usuarioTag",nullable = false,length = 20)
    private String usuarioTag;
    @Column(name = "passwordUsuario",nullable = false,length = 40)
    private String passwordUsuario;
    @ManyToOne
    @JoinColumn
    private Closet closet;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nameUsuario, String lastNameUsuario, String addressUsuario, String cardUsuario, String telephoneUsuario, String mail, LocalDate birthDate, String usuario, String passwordUsuario, Closet closet) {
        this.idUsuario = idUsuario;
        this.nameUsuario = nameUsuario;
        this.lastNameUsuario = lastNameUsuario;
        this.addressUsuario = addressUsuario;
        this.cardUsuario = cardUsuario;
        this.telephoneUsuario = telephoneUsuario;
        this.mail = mail;
        this.birthDate = birthDate;
        this.usuarioTag = usuario;
        this.passwordUsuario = passwordUsuario;
        this.closet = closet;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNameUsuario() {
        return nameUsuario;
    }

    public void setNameUsuario(String nameUsuario) {
        this.nameUsuario = nameUsuario;
    }

    public String getLastNameUsuario() {
        return lastNameUsuario;
    }

    public void setLastNameUsuario(String lastNameUsuario) {
        this.lastNameUsuario = lastNameUsuario;
    }

    public String getAddressUsuario() {
        return addressUsuario;
    }

    public void setAddressUsuario(String addressUsuario) {
        this.addressUsuario = addressUsuario;
    }

    public String getCardUsuario() {
        return cardUsuario;
    }

    public void setCardUsuario(String cardUsuario) {
        this.cardUsuario = cardUsuario;
    }

    public String getTelephoneUsuario() {
        return telephoneUsuario;
    }

    public void setTelephoneUsuario(String telephoneUsuario) {
        this.telephoneUsuario = telephoneUsuario;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getUsuario() {
        return usuarioTag;
    }

    public void setUsuario(String usuario) {
        this.usuarioTag = usuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public Closet getCloset() {
        return closet;
    }

    public void setCloset(Closet closet) {
        this.closet = closet;
    }
}
