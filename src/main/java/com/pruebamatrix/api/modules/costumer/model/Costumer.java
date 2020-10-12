package com.pruebamatrix.api.modules.costumer.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COSTUMERS")
public class Costumer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCostumer;
	private String name;
	private String lastName;
	private String secondLastName;
	private String phone;
	private String address;
	private String email;
	private Date birthDate;
	
	public Long getIdCostumer() {
		return idCostumer;
	}
	public void setIdCostumer(Long idCostumer) {
		this.idCostumer = idCostumer;
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
	@Override
	public String toString() {
		return "Costumer [idCostumer=" + idCostumer + ", name=" + name + ", lastName=" + lastName + ", secondLastName="
				+ secondLastName + ", phone=" + phone + ", address=" + address + ", email=" + email + ", birthDate="
				+ birthDate + "]";
	}
}
