package pe.edu.upc.clothingfashion.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
public class Users{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	@Column(name = "nameUser",nullable = false,length = 40)
	private String nameUser;
	@Column(name = "lastNameUser",nullable = false,length = 40)
	private String lastNameUser;
	@Column(name = "adressUser",length = 80)
	private String adressUser;
	@Column(name = "cardUser",length = 16)
	private String cardUser;
	@Column(name = "telephoneUser",nullable = false,length = 9)
	private String telephoneUser;
	@Column(name = "mail",nullable = false,length = 40)
	private String mail;
	@Column(name = "birthDate",nullable = false)
	private LocalDate birthDate;
	@Column(length = 30, unique = true)
	private String username;
	@Column(length = 200)
	private String password;
	private Boolean enabled;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name = "user_id")
	private List<Role> roles;

	public Users() {
	}

	public Users(int idUser, String nameUser, String lastNameUser, String adressUser, String cardUser, String telephoneUser, String mail, LocalDate birthDate, String username, String password, Boolean enabled, List<Role> roles) {
		this.idUser = idUser;
		this.nameUser = nameUser;
		this.lastNameUser = lastNameUser;
		this.adressUser = adressUser;
		this.cardUser = cardUser;
		this.telephoneUser = telephoneUser;
		this.mail = mail;
		this.birthDate = birthDate;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.roles = roles;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

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

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}