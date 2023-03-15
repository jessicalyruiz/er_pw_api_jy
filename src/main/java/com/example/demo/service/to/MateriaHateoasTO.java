package com.example.demo.service.to;

import org.springframework.hateoas.RepresentationModel;

public class MateriaHateoasTO extends RepresentationModel<MateriaHateoasTO>{

	
	public String nombre;
	public String codigo;
	public Integer numeroCreditos;
	


	
	//get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getNumeroCreditos() {
		return numeroCreditos;
	}

	public void setNumeroCreditos(Integer numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
	}


	
	
	
	
}
