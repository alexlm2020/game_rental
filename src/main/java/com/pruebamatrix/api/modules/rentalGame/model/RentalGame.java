package com.pruebamatrix.api.modules.rentalGame.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RENTAL_GAMES")
public class RentalGame implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRentalGame;
	private Long idRental;
	@Column(name="ID_GAME_X_TECNOLOGY")
	private Long idGameTecnology;
	private Double value;
	private Timestamp dateInitRental;
	private Timestamp dateFinishRental;
	
	
	public Long getIdRentalGame() {
		return idRentalGame;
	}
	public void setIdRentalGame(Long idRentalGame) {
		this.idRentalGame = idRentalGame;
	}
	public Long getIdRental() {
		return idRental;
	}
	public void setIdRental(Long idRental) {
		this.idRental = idRental;
	}
	public Long getIdGameTecnology() {
		return idGameTecnology;
	}
	public void setIdGameTecnology(Long idGameTecnology) {
		this.idGameTecnology = idGameTecnology;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public Timestamp getDateInitRental() {
		return dateInitRental;
	}
	public void setDateInitRental(Timestamp dateInitRental) {
		this.dateInitRental = dateInitRental;
	}
	public Timestamp getDateFinishRental() {
		return dateFinishRental;
	}
	public void setDateFinishRental(Timestamp dateFinishRental) {
		this.dateFinishRental = dateFinishRental;
	}
	
	

}
