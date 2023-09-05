package pe.edu.upc.clothingfashion.entities;
import javax.persistence.*;

@Entity
@Table(name = "Prenda")
public class Prenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPrenda;
    @ManyToOne
    @JoinColumn(name="idTemporada")
    private Temporada temporada;
    @ManyToOne
    @JoinColumn(name="idTextura")
    private Textura textura;
    @ManyToOne
    @JoinColumn(name="idColor")
    private Color color;
    @ManyToOne
    @JoinColumn(name="idEvento")
    private Evento evento;
    @ManyToOne
    @JoinColumn(name = "idCatalogo")
    private Catalogo catalogo;
    @ManyToOne
    @JoinColumn(name = "idTienda")
    private Tienda tienda;
    @ManyToOne
    @JoinColumn
    private Armario armario;

}
