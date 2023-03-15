package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.to.MateriaHateoasTO;
import com.example.demo.service.to.MateriaTO;


public interface IMateriaService {

	
	public void create(Materia materia);
	public Materia read(Integer id); 
	public void update(Materia materia); 
	public void delete(Integer id); 
	
	
	public void crearMateria(MateriaTO materiaTO);
	
	public List<MateriaHateoasTO> buscarTodas();
	
	public MateriaTO materiaCompleta(String codigo);
	
	public Materia buscarCodigo(String codigo);
	public void eliminarMateria(String codigo);
}
