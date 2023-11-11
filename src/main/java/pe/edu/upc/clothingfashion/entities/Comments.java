package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComments;
    @Column(name = "titleComment",nullable = false,length = 500)
    private String titleComment;
    @Column(name = "descriptionComment",nullable = false,length = 500)
    private String descriptionComment;
    @Column(name = "dateComment",nullable = false)
    private LocalDate dateComment;
    @Column(name = "score",nullable = false,length = 1)
    private int score;
    @ManyToOne
    @JoinColumn(name = "idOutfit")
    private Outfit outfit;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private Users users;

    public Comments() {
    }

    public Comments(int idComments, String titleComment, String descriptionComment, LocalDate dateComment, int score, Outfit outfit, Users users) {
        this.idComments = idComments;
        this.titleComment = titleComment;
        this.descriptionComment = descriptionComment;
        this.dateComment = dateComment;
        this.score = score;
        this.outfit = outfit;
        this.users = users;
    }

    public int getIdComments() {
        return idComments;
    }

    public void setIdComments(int idComments) {
        this.idComments = idComments;
    }

    public String getDescriptionComment() {
        return descriptionComment;
    }

    public void setDescriptionComment(String descriptionComment) {
        this.descriptionComment = descriptionComment;
    }

    public LocalDate getDateComment() {
        return dateComment;
    }

    public void setDateComment(LocalDate dateComment) {
        this.dateComment = dateComment;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }

    public String getTitleComment() {
        return titleComment;
    }

    public void setTitleComment(String titleComment) {
        this.titleComment = titleComment;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
