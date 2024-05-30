package entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "ModeloInventario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ModeloInventario extends EntidadBase{
    @NotNull
    private Enumeraciones.ModeloInventario nombreModelo;

    @NotNull
    private int loteOptimo;

    @NotNull
    private int puntoPedido;

    @NotNull
    private int stockSeguridad;


}
