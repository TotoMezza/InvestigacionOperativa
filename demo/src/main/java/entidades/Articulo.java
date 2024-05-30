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
    private String nombre;

    @NotNull
    private Double precio;

    @NotNull
    private int stockActual;

    @NotNull
    @ManyToOne()
    private ModeloInventario modeloInv;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @NotNull
    @Builder.Default
    @JoinColumn(name = "id_Prediccion")
    private List<Prediccion> Predicciones = new ArrayList<>();
    private TablaDemanda tablaDemanda;

}
