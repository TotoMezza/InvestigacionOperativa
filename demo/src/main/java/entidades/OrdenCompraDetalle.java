package entidades;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "ordencompradetalle")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class OrdenCompraDetalle extends EntidadBase{
    @NotNull
    private  int cantidadOCD;

    @NotNull
    private int nroLineaDetalleOCD;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_OrdenCompra")
    private OrdenCompra ordenCompra;
}
