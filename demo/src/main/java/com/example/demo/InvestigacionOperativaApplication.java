package com.example.demo;

import entidades.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class InvestigacionOperativaApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestigacionOperativaApplication.class, args);
	}
	/*
	Articulo articulo1= new Articulo();

	public void setArticulo1(Articulo articulo1) {
		this.articulo1 = articulo1;
		articulo1.setPrecio(200.0);
	}

	VentaDetalle detalle1= new VentaDetalle();

	public void setDetalle1(VentaDetalle detalle1) {
		this.detalle1 = detalle1;
		detalle1.setArticulo(articulo1);
		detalle1.setCantidadVenta(2);
	}

	Venta venta1= new Venta();

	public void setVenta1(Venta venta1) {
		this.venta1 = venta1;
		venta1.AgregarDetalleVenta(detalle1);
		try{
			venta1.CalcularTotalVenta();
		}catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}

	}

	public Venta getVenta1() {
		return venta1;
	}
	 */
}
