package com.pruebamatrix.api.modules.game.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.pruebamatrix.api.modules.gameTecnology.model.GameTecnology;

public class GameRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idGame;
	private String name;
	private Integer year;
	private String trademark;
	private String hero;
	private String director;
	private Double currentValue;
	private Double previousValue;
	private List<GameTecnology> gameTecnology = new ArrayList<>();

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

	public List<GameTecnology> getGameTecnology() {
		return gameTecnology;
	}

	public void setGameTecnology(List<GameTecnology> gameTecnology) {
		this.gameTecnology = gameTecnology;
	}

}
