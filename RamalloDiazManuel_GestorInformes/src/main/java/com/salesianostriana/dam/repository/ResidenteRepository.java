package com.salesianostriana.dam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostriana.dam.model.Residente;

@Repository
public interface ResidenteRepository extends JpaRepository<Residente, Long>{

	
}
