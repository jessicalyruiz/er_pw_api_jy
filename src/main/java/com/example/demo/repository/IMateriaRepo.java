package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.to.MateriaHateoasTO;

public interface IMateriaRepo {

	
	public void create(Materia materia);
	public Materia read(Integer id); 
	public void update(Materia materia); 
	public void delete(Integer id); 
	public List<Materia> buscarTodas();
	public Materia buscarCodigo(String codigo); 

}
