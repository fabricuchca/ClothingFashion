package pe.edu.upc.clothingfashion.dtos;

import pe.edu.upc.clothingfashion.entities.Users;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class RecommendationsDTO {
    private int idRecommendations;
    private String title;
    private String calification;
    private String addicionalLink;
    private String categoryTag;
    private Users users;

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

    public String getCalification() {
        return calification;
    }

    public void setCalification(String calification) {
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

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
