package pe.edu.upc.clothingfashion.dtos;
import pe.edu.upc.clothingfashion.entities.Role;
import java.time.LocalDate;
import java.util.List;

public class UsersDTO {
    private int idUser;
    private String nameUser;
    private String lastNameUser;
    private String adressUser;
    private String cardUser;
    private String telephoneUser;
    private String mail;
    private LocalDate birthDate;
    private String username;
    private String password;
    private Boolean enabled;
    private List<Role> roles;

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastNameUser() {
        return lastNameUser;
    }

    public void setLastNameUser(String lastNameUser) {
        this.lastNameUser = lastNameUser;
    }

    public String getadressUser() {
        return adressUser;
    }

    public void setadressUser(String adressUser) {
        this.adressUser = adressUser;
    }

    public String getCardUser() {
        return cardUser;
    }

    public void setCardUser(String cardUser) {
        this.cardUser = cardUser;
    }

    public String getTelephoneUser() {
        return telephoneUser;
    }

    public void setTelephoneUser(String telephoneUser) {
        this.telephoneUser = telephoneUser;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
