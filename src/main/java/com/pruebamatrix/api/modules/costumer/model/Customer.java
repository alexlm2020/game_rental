package com.pruebamatrix.api.modules.costumer.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERS")
public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCustomer;
	private String name;
	private String lastName;
	private String secondLastName;
	private String phone;
	private String address;
	private String email;
	private Date birthDate;
	private String identification;
	@Column(name="ID_TYPEIDENTIFICATION")
	private Long idTypeIdentification;
	
	public Long getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSecondLastName() {
		return secondLastName;
	}
	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	public Long getIdTypeIdentification() {
		return idTypeIdentification;
	}
	public void setIdTypeIdentification(Long idTypeIdentification) {
		this.idTypeIdentification = idTypeIdentification;
	}
	@Override
	public String toString() {
		return "Costumer [idCostumer=" + idCustomer + ", name=" + name + ", lastName=" + lastName + ", secondLastName="
				+ secondLastName + ", phone=" + phone + ", address=" + address + ", email=" + email + ", birthDate="
				+ birthDate + "]";
	}
}
