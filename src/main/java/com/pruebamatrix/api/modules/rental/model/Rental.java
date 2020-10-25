package com.pruebamatrix.api.modules.rental.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RENTALS")
public class Rental implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRental;
	private Long idCustomer;
	@Column(name="DATE_RENTAL")
	private Timestamp dateRental;
	private Double value;
	private Double valueIva;
	private Double valueTotal;
	
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
	
}
