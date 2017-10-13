package com.salesianostriana.dam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.model.Residente;
import com.salesianostriana.dam.service.ResidenteService;

@Controller
public class ResidenteController {

	@Autowired
	ResidenteService residenteService;

	//Pagina inicial
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	//Mostrar los residentes
	
	@GetMapping("/gestionResidentes")
	public String GestionResidentes(Model model) {

		model.addAttribute("residente", residenteService.findAll());
		return "gestion-residentes";
	}
	
	
	//Agregar Residente

	@GetMapping("/agregarResidente")
	public String agregarResidente(Model model) {
		Residente residente = new Residente();

		model.addAttribute("agregarResidente", residente);
		return "agregar-residente";
	}

	
	@PostMapping("/addResidente")
	public String submitResidente(@ModelAttribute("agregarResidente") Residente residente, Model model) {

		model.addAttribute("residente", residente);
		residenteService.addResidente(residente);

		return "redirect:/gestionResidentes";
	}
	
	//Editar Residente
	

	@GetMapping("/editarResidente/{id}")
	public String editarResidente(@PathVariable("id") long id, Model model) {

		Residente residente = residenteService.findById(id);
		model.addAttribute("residenteForm", residente);

		return "editar-residente";
	}

	@PostMapping("/{id}/editResidente")
	public String editResidente(@ModelAttribute("residenteForm") Residente residente, Model model) {

		residenteService.updateResidente(residente);

		return "redirect:/gestionResidentes";
	}
	
	
	//Borrar Residente
	
	@GetMapping("/borrarResidente/{id}")
	public String borrarResidente(@PathVariable("id") long id, Model model) {
		residenteService.deleteResidente(residenteService.findById(id));
		
		return "redirect:/gestionResidentes";
	}
}
