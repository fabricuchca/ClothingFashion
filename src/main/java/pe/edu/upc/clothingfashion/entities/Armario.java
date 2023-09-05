package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;

@Entity
@Table(name = "Armario")
public class Armario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArmario;
    @Column(name = "estiloArmario",nullable = false,length = 40)
    private String estiloArmario;
    @Column(name = "nombreArmario",nullable = false,length = 40)
    private String nombreArmario;

    public Armario() {
    }

    public Armario(int idArmario, String estiloArmario, String nombreArmario) {
        this.idArmario = idArmario;
        this.estiloArmario = estiloArmario;
        this.nombreArmario = nombreArmario;
    }

    public int getIdArmario() {
        return idArmario;
    }

    public void setIdArmario(int idArmario) {
        this.idArmario = idArmario;
    }

    public String getEstiloArmario() {
        return estiloArmario;
    }

    public void setEstiloArmario(String estiloArmario) {
        this.estiloArmario = estiloArmario;
    }

    public String getNombreArmario() {
        return nombreArmario;
    }

    public void setNombreArmario(String nombreArmario) {
        this.nombreArmario = nombreArmario;
    }
}
