package entidades;

import Enumeraciones.EstadoOrdenCompra;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.Date;

@Entity
@Table(name = "ordencompra")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class OrdenCompra extends EntidadBase{
    @NotNull
    private EstadoOrdenCompra estadoOrdenCompra;

    @NotNull
    private Date fechaOrdenCompra;

    @NotNull
    private  double totalOrdenCompra;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @NotNull
    @Builder.Default
    @JoinColumn(name ="id_OrdenCompra")
    private List<OrdenCompraDetalle> DetallesOC = new ArrayList<>();
    }
