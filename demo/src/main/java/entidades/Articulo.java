package entidades;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "articulos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Articulo extends EntidadBase {

    @NotNull
    @Column(name = "nombre-Articulo")
    private String nombre;

    @NotNull
    @Column(name = "precio-Articulo")
    private Double precio;

    public Double getPrecio() {
        return precio;
    }

    @NotNull
    @Column(name = "stock-Actual")
    private int stockActual;

    @NotNull
    @Column(name = "lote_Optimo")
    private Integer loteOptimo;

    @NotNull
    @Column(name = "stock_Seguridad")
    private Integer stockSeguridad;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @NotNull
    @Builder.Default
    @JoinColumn(name = "id_Prediccion")
    private List<Prediccion> Predicciones = new ArrayList<>(); //Revisar, dudosa navegabilidad
    private TablaDemanda tablaDemanda;

}
