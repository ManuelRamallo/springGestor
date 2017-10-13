package com.salesianostriana.dam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.model.Apartado;
import com.salesianostriana.dam.repository.ApartadoRepository;

@Service
public class ApartadoService {

	@Autowired
	ApartadoRepository apartadoRepository;
	
	public List<Apartado> findAll(){
		return apartadoRepository.findAll();
	}
	
	public Apartado findById(long id){
		return apartadoRepository.findOne(id);
	}
	
	public Apartado addApartado(Apartado apartado) {
		return apartadoRepository.save(apartado);
	}
	
	public Apartado updateApartado(Apartado apartado) {
		return apartadoRepository.save(apartado);
	}
	
	public void deleteApartado(Apartado apartado) {
		apartadoRepository.delete(apartado);
	}
	
}
