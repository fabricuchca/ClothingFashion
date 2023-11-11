package pe.edu.upc.clothingfashion.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "Recommendations")
public class Recommendations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecommendations;
    @Column(name = "title",nullable = false,length = 50)
    private String title;
    @Column(name = "calification",nullable = false,length = 1)
    private int calification;
    @Column(name = "addicionalLink",length = 1000)
    private String addicionalLink;
    @Column(name = "categoryTag",nullable = false,length = 50)
    private String categoryTag;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private Users users;

    public Recommendations() {
    }

    public Recommendations(int idRecommendations, String title, int calification, String addicionalLink, String categoryTag, Users users) {
        this.idRecommendations = idRecommendations;
        this.title = title;
        this.calification = calification;
        this.addicionalLink = addicionalLink;
        this.categoryTag = categoryTag;
        this.users = users;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public int getIdRecommendations() {
        return idRecommendations;
    }

    public void setIdRecommendations(int idRecommendations) {
        this.idRecommendations = idRecommendations;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCalification() {
        return calification;
    }

    public void setCalification(int calification) {
        this.calification = calification;
    }

    public String getAddicionalLink() {
        return addicionalLink;
    }

    public void setAddicionalLink(String addicionalLink) {
        this.addicionalLink = addicionalLink;
    }

    public String getCategoryTag() {
        return categoryTag;
    }

    public void setCategoryTag(String categoryTag) {
        this.categoryTag = categoryTag;
    }
}
