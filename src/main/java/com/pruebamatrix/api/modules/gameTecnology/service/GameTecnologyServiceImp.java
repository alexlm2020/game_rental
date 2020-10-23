package com.pruebamatrix.api.modules.gameTecnology.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebamatrix.api.modules.gameTecnology.model.GameTecnology;
import com.pruebamatrix.api.modules.gameTecnology.repository.GameTecnologyRepository;

@Service
public class GameTecnologyServiceImp implements GameTecnologyService {

	@Autowired
	private GameTecnologyRepository gameTecnologyRepository;
	
	@Override
	public GameTecnology save(GameTecnology gameTecnology) {
		return gameTecnologyRepository.save(gameTecnology);
	}

}
