package entidades;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "articulos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class VentaDetalle extends EntidadBase {
    @NotNull
    private int cantidadVenta;

    @NotNull
    private Double subtotal;

    public Double getSubtotal() {
        return subtotal;
    }

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Articulo")
    private Articulo articulo;

    public void setSubtotal(int cantidadVenta, Articulo articulo) {
        this.subtotal = cantidadVenta*articulo.getPrecio();
    }
}
