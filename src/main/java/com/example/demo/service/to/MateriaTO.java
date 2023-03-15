package com.example.demo.service.to;

public class MateriaTO {

	
	public String nombre;
	public String codigo;
	public Integer numeroCreditos;
	
	public String profesor;

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

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	@Override
	public String toString() {
		return "MateriaTO [nombre=" + nombre + ", codigo=" + codigo + ", numeroCreditos=" + numeroCreditos
				+ ", profesor=" + profesor + "]";
	}
	
	
	

}
