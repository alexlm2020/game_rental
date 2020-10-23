package com.pruebamatrix.api.modules.game.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pruebamatrix.api.Utils.service.UtilsService;
import com.pruebamatrix.api.modules.game.model.Game;
import com.pruebamatrix.api.modules.game.model.GameRequest;
import com.pruebamatrix.api.modules.game.repository.GameRepository;
import com.pruebamatrix.api.modules.gameTecnology.model.GameTecnology;
import com.pruebamatrix.api.modules.gameTecnology.repository.GameTecnologyRepository;

@Service
public class GameServiceImp implements GameService{

	@Autowired
	private GameRepository gameRepository;
	
	@Autowired
	private GameTecnologyRepository gameTecnologyRepository;
	
	@Autowired
	private UtilsService utilsService;
	
	
	@Override
	public Iterable<Game> findAll() {
		
		return null;
	}

	@Override
	public Page<Game> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Game> findById(Long idGame) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Game save(GameRequest gameRequest) {
		
		Game game = new Game();
		game.setName(gameRequest.getName());
		game.setDirector(gameRequest.getDirector());
		game.setHero(gameRequest.getHero());
		game.setLastUpdate(utilsService.getTime());
		game.setTrademark(gameRequest.getTrademark());
		game.setYear(gameRequest.getYear());
		game.setCurrentValue(gameRequest.getCurrentValue());
		game.setPreviousValue(gameRequest.getPreviousValue());
		
		Game gameResponse = gameRepository.save(game);
		
		for ( GameTecnology gt : gameRequest.getGameTecnology()) {
			
			GameTecnology gameTec = new GameTecnology();
			gameTec.setIdGame(gameResponse.getIdGame());
			gameTec.setIdTecnology(gt.getIdTecnology());
			gameTec.setCant(gt.getCant());
			
			gameTecnologyRepository.save(gameTec);	
		}

		return gameResponse;
	}

	@Override
	public void deleteUserById(Long idGame) {
		// TODO Auto-generated method stub
		
	}

}
