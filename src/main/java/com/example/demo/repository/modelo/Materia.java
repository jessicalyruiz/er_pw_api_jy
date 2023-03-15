package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "materia")
public class Materia {

	
	@Id
	@Column(name = "mate_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_materia")
	@SequenceGenerator(name = "seq_materia", sequenceName = "seq_materia", allocationSize = 1)
	private Integer id;
	
	@Column(name = "mate_nombre")
	public String nombre;
	
	@Column(name = "mate_codigo")
	public String codigo;
	
	@Column(name = "mate_numeroCreditos")
	public Integer numeroCreditos;
	
	
	@Column(name = "mate_profesor")
	public String profesor;

	
	//get y set

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


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
		return "Materia [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", numeroCreditos=" + numeroCreditos
				+ ", profesor=" + profesor + "]";
	}
	
	
	
	
	
}
