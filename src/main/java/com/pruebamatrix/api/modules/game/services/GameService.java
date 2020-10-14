package com.pruebamatrix.api.modules.game.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebamatrix.api.Utils.service.UtilsService;
import com.pruebamatrix.api.modules.game.model.Game;
import com.pruebamatrix.api.modules.game.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Autowired
	private UtilsService utilsService;
	
	public Game save (Game game) {

		game.setLastUpdate(utilsService.getTime());
		
		return gameRepository.save(game);
	}
	
	public Optional<Game> getGame(Long idGame) {
		return gameRepository.findById(idGame);
	}
	
}
