package entidades;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;


public class ProveedorArticulo extends EntidadBase{

    @NotNull
    @Column(name = "precio_articulo")
    private Double precioArticulo;

    @NotNull
    @Column(name = "costo_pedido")
    private Double costoPedidoArticulo;

    @NotNull
    @Column(name = "costo_almacenamiento")
    private Double costoAlmacenamiento;

    @Column(name = "punto_pedido")
    private Integer puntoPedido;

    @Column(name = "cgi")
    private Double cgi;

    @Column(name = "stock_seguridad")
    private Double stockSeguridad;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;

}
