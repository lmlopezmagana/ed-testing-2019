package com.salesianostriana.dam.pruebas;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

//import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.salesianostriana.dam.pruebas.modelo.Producto;
import com.salesianostriana.dam.pruebas.servicios.ProductoServicio;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductoServicioTests {

	@Autowired
	ProductoServicio servicio;

	@Test
	public void test_ProductoEnMayusculas() {

		Producto nuevo = new Producto(1234, "Producto nuevo", 123.4f);
		Producto esperado = new Producto(1234, "PRODUCTO NUEVO", 123.4f);

		assertEquals(esperado, servicio.productoEnMayusculas(nuevo));
//		assertThat(esperado.getNombre()).
//			isEqualTo(servicio.productoEnMayusculas(nuevo).getNombre());

	}
	
	@Test
	public void test_totalCarrito() {
		
		Map<Producto, Integer> carrito = new HashMap<>();
		
		carrito.put(new Producto(1234,"Producto 1", 20.0f), 2);
		carrito.put(new Producto(1235,"Producto 2", 10.0f), 6);
		
		assertEquals(100.0, servicio.precioTotal(carrito), 0.001);
		
	}

}
