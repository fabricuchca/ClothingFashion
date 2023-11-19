package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "roles", uniqueConstraints = { @UniqueConstraint(columnNames = { "user_id", "rol" }) })
public class Role{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRole;
	@Column(name = "rol",length = 50, nullable = false)
	private String rol;
	
	@ManyToOne
	@JoinColumn(name="user_id", nullable=false)
	private Users user;

	public Role() {
	}
//GETTERS AND SETTERES

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public Role(Long idRole, String rol, Users user) {
		this.idRole = idRole;
		this.rol = rol;
		this.user = user;
	}
}