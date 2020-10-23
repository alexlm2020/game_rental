package com.pruebamatrix.api.modules.gameTecnology.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GAMES_X_TECNOLOGIES")
public class GameTecnology implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGamexTecnology;
	private Long idGame;
	private Long idTecnology;
	private Integer cant;
	
	public Long getIdGamexTecnology() {
		return idGamexTecnology;
	}
	public void setIdGamexTecnology(Long idGamexTecnology) {
		this.idGamexTecnology = idGamexTecnology;
	}
	public Long getIdGame() {
		return idGame;
	}
	public void setIdGame(Long idGame) {
		this.idGame = idGame;
	}
	public Long getIdTecnology() {
		return idTecnology;
	}
	public void setIdTecnology(Long idTecnology) {
		this.idTecnology = idTecnology;
	}
	public Integer getCant() {
		return cant;
	}
	public void setCant(Integer cant) {
		this.cant = cant;
	}

}
