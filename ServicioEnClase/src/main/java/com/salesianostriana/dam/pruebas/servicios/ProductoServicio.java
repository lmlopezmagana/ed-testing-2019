package com.salesianostriana.dam.pruebas.servicios;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.pruebas.modelo.Producto;
import com.salesianostriana.dam.pruebas.repositorios.ProductoRepositorio;
import com.salesianostriana.dam.pruebas.servicios.base.BaseService;

@Service
public class ProductoServicio extends BaseService<Producto, Long, ProductoRepositorio> {

	
	public Producto productoEnMayusculas(Producto p) {
		p.setNombre(p.getNombre().toUpperCase());
		return p;
				
	}
	
	public double precioTotal(Map<Producto, Integer> carrito) {
		return carrito
			.entrySet()
			.stream()
			.mapToDouble(e -> e.getKey().getPvp() * e.getValue())
			.sum();
			
	}
	
}
