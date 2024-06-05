package entidades;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;


@Entity
@Table(name = "proveedores")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class Proveedor extends EntidadBase{
    @NotNull
    @Column(name = "nombre_proveedor")
    private String nombreProveedor;

}
