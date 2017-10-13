package com.salesianostriana.dam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.model.Residente;
import com.salesianostriana.dam.repository.ResidenteRepository;

@Service
public class ResidenteService {

	@Autowired
	ResidenteRepository residenteRepository;
	
	public List<Residente> findAll(){
		return residenteRepository.findAll();
	}
	
	public Residente findById(long id){
		return residenteRepository.findOne(id);
	}
	
	
	public Residente addResidente(Residente residente) {
		return residenteRepository.save(residente);
	}
	
	public Residente updateResidente(Residente residente) {
		return residenteRepository.save(residente);
	}
	
	public void deleteResidente(Residente residente) {
		residenteRepository.delete(residente);
	}
	
	
	
}
