package com.salesianostriana.dam.pruebas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.pruebas.modelo.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Long> {

}
