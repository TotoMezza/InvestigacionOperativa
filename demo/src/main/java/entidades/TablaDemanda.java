package entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "ordencompra")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TablaDemanda extends EntidadBase{
    @NotNull
    private int totalDemanda;

    @NotNull
    @ManyToOne
    private Articulo articulo;

    @NotNull
    @ManyToOne
    private Venta venta;



}
