package com.pruebamatrix.api.modules.tecnology.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TECNOLOGIES")
public class Tecnology implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTecnology;
	private String name;
	public Long getIdTecnology() {
		return idTecnology;
	}
	public void setIdTecnology(Long idTecnology) {
		this.idTecnology = idTecnology;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
