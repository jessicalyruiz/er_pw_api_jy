package com.example.demo.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IMateriaService;
import com.example.demo.service.to.MateriaHateoasTO;
import com.example.demo.service.to.MateriaTO;


@RestController
@RequestMapping(path = "/materias")
@CrossOrigin("http://localhost:8080")
public class MateriaControllerRestFull {

	@Autowired
	IMateriaService materiaService;
	
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void crearMateria(@RequestBody MateriaTO materiaTO) {
		
		this.materiaService.crearMateria(materiaTO);
		
		
		
		
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MateriaHateoasTO> listarMaterias(){
		List<MateriaHateoasTO> listaMAterias= this.materiaService.buscarTodas();

		for (MateriaHateoasTO m : listaMAterias) {
			//Link myLink=linkTo(methodOn(MateriaControllerRestFull.class, null))
		Link myLink=linkTo( methodOn(MateriaControllerRestFull.class).consultarMateria(m.getCodigo())).withRel("materia");
			m.add(myLink);
			System.out.println("materia:  "+m.getNombre());
		}
		return listaMAterias;
	}
	
	@GetMapping(path = "/Completa", produces = MediaType.APPLICATION_JSON_VALUE)
	public MateriaTO consultarMateria(@RequestParam String codigo) {
		
		return this.materiaService.materiaCompleta(codigo);
	}
	
	@DeleteMapping
	public void eliminarMateria(@RequestParam String codigo) {
		this.materiaService.eliminarMateria(codigo);
	}
	
}
