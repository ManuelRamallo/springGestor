package com.salesianostriana.dam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostriana.dam.model.Apartado;

@Repository
public interface ApartadoRepository extends JpaRepository<Apartado, Long>{

}
