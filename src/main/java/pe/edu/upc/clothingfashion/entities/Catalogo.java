package pe.edu.upc.clothingfashion.entities;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Catalogo")
public class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCatalogo;
    @OneToMany
    @JoinColumn(name="idEvento")
    private List<Recomendaciones> recomendaciones;

    public Catalogo() {
    }

    public Catalogo(int idCatalogo, List<Recomendaciones> recomendaciones) {
        this.idCatalogo = idCatalogo;
        this.recomendaciones = recomendaciones;
    }

    public int getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(int idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public List<Recomendaciones> getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(List<Recomendaciones> recomendaciones) {
        this.recomendaciones = recomendaciones;
    }
}
