package com.pruebamatrix.api.modules.gameTecnology.service;

import java.util.List;
import java.util.Map;

import com.pruebamatrix.api.modules.gameTecnology.model.GameTecnology;

public interface GameTecnologyService {
	
	public GameTecnology save(GameTecnology game) throws Exception;
	
	public List<Map<String, Object>> getGamesRental(String hero, String trademark, String director) throws Exception; 
}
