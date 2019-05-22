package com.salesianostriana.dam.pruebas.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Entity
public class Producto {

	public Producto(long l, String string, float d) {
		this.id = l;
		this.nombre = string;
		this.pvp = d;
	}

	@Id
	private long id;
	
	private String nombre;
	
	private float pvp;
	
}
