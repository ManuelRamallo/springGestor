package com.salesianostriana.dam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.model.Informe;
import com.salesianostriana.dam.repository.InformeRepository;

@Service
public class InformeService {

	@Autowired
	InformeRepository informeRepository;
	
	public List<Informe> findAll(){
		return informeRepository.findAll();
	}
	
	public Informe findById(long id){
		return informeRepository.findOne(id);
	}
	
	public Informe addInforme(Informe informe) {
		return informeRepository.save(informe);
	}
	
	public Informe updateInforme(Informe informe) {
		return informeRepository.save(informe);
	}
	
	public void deleteInforme(Informe informe) {
		informeRepository.delete(informe);
	}
	
}
