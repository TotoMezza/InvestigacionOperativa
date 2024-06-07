package entidades;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;


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

    @NotNull
    @Column(name = "tiempo_proveedor")
    private int tiempoDemoraProveedor;

    @NotNull
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @Builder.Default
    @JoinColumn(name ="id_Proveedor")
    private List<ProveedorArticulo> proveedorArt = new ArrayList<>();

    public void AgregarProveedorArticulo(ProveedorArticulo pA1) {
        proveedorArt.add(pA1);
    }

}
