package com.pruebamatrix.api.modules.gameTecnology.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebamatrix.api.modules.gameTecnology.model.GameTecnology;
import com.pruebamatrix.api.modules.gameTecnology.repository.GameTecnologyRepository;

@Service
public class GameTecnologyServiceImp implements GameTecnologyService {

	@Autowired
	private GameTecnologyRepository gameTecnologyRepository;
	
	@Override
	public GameTecnology save(GameTecnology gameTecnology) throws Exception{
		return gameTecnologyRepository.save(gameTecnology);
	}

	@Override
	public List<Map<String, Object>> getGamesRental(String hero, String trademark, String director)
			throws Exception {
		return gameTecnologyRepository.getGamesRental(hero, trademark, director);
	}

}
