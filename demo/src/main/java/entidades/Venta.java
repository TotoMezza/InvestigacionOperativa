package entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "articulos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Venta extends EntidadBase{

    @NotNull
    private Double totalVenta;

    @NotNull
    private Date fechaVenta;

    @NotNull
    @OneToMany
    @Builder.Default
    private List<VentaDetalle> ventaDetalles = new ArrayList<>();



}
