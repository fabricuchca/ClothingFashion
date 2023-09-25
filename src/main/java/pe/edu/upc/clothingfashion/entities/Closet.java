package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;

@Entity
@Table(name = "Closet")
public class Closet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCloset;
    @Column(name = "styleCloset",nullable = false,length = 40)
    private String styleCloset;
    @Column(name = "nameCloset",nullable = false,length = 40)
    private String nameCloset;

    public Closet() {
    }

    public Closet(int idCloset, String styleCloset, String nameCloset) {
        this.idCloset = idCloset;
        this.styleCloset = styleCloset;
        this.nameCloset = nameCloset;
    }

    public int getIdCloset() {
        return idCloset;
    }

    public void setIdCloset(int idCloset) {
        this.idCloset = idCloset;
    }

    public String getstyleCloset() {
        return styleCloset;
    }

    public void setstyleCloset(String styleCloset) {
        this.styleCloset = styleCloset;
    }

    public String getnameCloset() {
        return nameCloset;
    }

    public void setnameCloset(String nameCloset) {
        this.nameCloset = nameCloset;
    }
}
