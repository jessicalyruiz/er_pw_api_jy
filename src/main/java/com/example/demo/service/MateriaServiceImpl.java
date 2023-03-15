package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IMateriaRepo;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.to.MateriaHateoasTO;
import com.example.demo.service.to.MateriaTO;

import jakarta.persistence.TypedQuery;


@Service
public class MateriaServiceImpl implements IMateriaService{

	@Autowired
	private IMateriaRepo materiaRepo;
	
	@Override
	public void create(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepo.create(materia);
	}

	@Override
	public Materia read(Integer id) {
		// TODO Auto-generated method stub
		return this.materiaRepo.read(id);
	}

	@Override
	public void update(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepo.update(materia);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.materiaRepo.delete(id);
	}

	@Override
	public void crearMateria(MateriaTO materiaTO) {
		// TODO Auto-generated method stub
		this.create(this.convertirMateria(materiaTO));
	}

	
	public Materia convertirMateria(MateriaTO materiaTO) {
		Materia materia=new Materia();
		materia.setCodigo(materiaTO.getCodigo());
		materia.setNombre(materiaTO.getNombre());
		materia.setNumeroCreditos(materiaTO.getNumeroCreditos());
		materia.setProfesor(materiaTO.getProfesor());
		return materia;
	}

	@Override
	public List<MateriaHateoasTO> buscarTodas() {
		// TODO Auto-generated method stub
		List<Materia> listaMeterias=this.materiaRepo.buscarTodas();
		
		return listaMeterias.stream().map(m->this.convertirMateriaHateoasTO(m)).collect(Collectors.toList());
	}
	
	public MateriaHateoasTO convertirMateriaHateoasTO(Materia materia) {
		MateriaHateoasTO materiaTO=new MateriaHateoasTO();
		materiaTO.setCodigo(materia.getCodigo());
		materiaTO.setNombre(materia.getNombre());
		materiaTO.setNumeroCreditos(materia.getNumeroCreditos());
		
		return materiaTO;
	}

	@Override
	public MateriaTO materiaCompleta(String codigo) {
		// TODO Auto-generated method stub
		return this.convertirMateriaTO(this.buscarCodigo(codigo));
	}
	
	
	public MateriaTO convertirMateriaTO(Materia materia) {
		MateriaTO materiaTO=new MateriaTO();
		materiaTO.setCodigo(materia.getCodigo());
		materiaTO.setNombre(materia.getCodigo());
		materiaTO.setNumeroCreditos(materia.getNumeroCreditos());
		materiaTO.setProfesor(materia.getProfesor());
		return materiaTO;
	}

	@Override
	public Materia buscarCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.materiaRepo.buscarCodigo(codigo);
	}

	@Override
	public void eliminarMateria(String codigo) {
		// TODO Auto-generated method stub
		Materia materia=this.materiaRepo.buscarCodigo(codigo);
		
		this.delete(materia.getId());
	}
	
}
