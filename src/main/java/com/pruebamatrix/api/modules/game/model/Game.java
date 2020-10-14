package com.pruebamatrix.api.modules.game.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="GAMES")
public class Game implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGame;
	private String name;
	private Integer year;
	private String trademark;
	private String hero;
	private String director;
	private Double currentValue;
	private Double previousValue;
	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
	private Timestamp lastUpdate;
	
	public Long getIdGame() {
		return idGame;
	}
	public void setIdGame(Long idGame) {
		this.idGame = idGame;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getTrademark() {
		return trademark;
	}
	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Double getCurrentValue() {
		return currentValue;
	}
	public void setCurrentValue(Double currentValue) {
		this.currentValue = currentValue;
	}
	public Double getPreviousValue() {
		return previousValue;
	}
	public void setPreviousValue(Double previousValue) {
		this.previousValue = previousValue;
	}
	public Timestamp getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	
}
