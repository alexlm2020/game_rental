package com.pruebamatrix.api.modules.rental.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.pruebamatrix.api.modules.rentalGame.model.RentalGame;

public class RentalRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idRental;
	private Long idCustomer;
	private Timestamp dateRental;
	private Double value;
	private Double valueIva;
	private Double valueTotal;
	
	private List<RentalGame> rentalGames = new ArrayList<>();

	public Long getIdRental() {
		return idRental;
	}

	public void setIdRental(Long idRental) {
		this.idRental = idRental;
	}

	public Long getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}

	public Timestamp getDateRental() {
		return dateRental;
	}

	public void setDateRental(Timestamp dateRental) {
		this.dateRental = dateRental;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Double getValueIva() {
		return valueIva;
	}

	public void setValueIva(Double valueIva) {
		this.valueIva = valueIva;
	}

	public Double getValueTotal() {
		return valueTotal;
	}

	public void setValueTotal(Double valueTotal) {
		this.valueTotal = valueTotal;
	}

	public List<RentalGame> getRentalGames() {
		return rentalGames;
	}

	public void setRentalGames(List<RentalGame> rentalGames) {
		this.rentalGames = rentalGames;
	}
	
}
