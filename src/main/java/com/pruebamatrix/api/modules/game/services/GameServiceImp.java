package com.pruebamatrix.api.modules.game.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pruebamatrix.api.Utils.service.UtilsService;
import com.pruebamatrix.api.modules.game.model.Game;
import com.pruebamatrix.api.modules.game.model.GameRequest;
import com.pruebamatrix.api.modules.game.repository.GameRepository;
import com.pruebamatrix.api.modules.gameTecnology.model.GameTecnology;
import com.pruebamatrix.api.modules.gameTecnology.service.GameTecnologyService;

@Service
public class GameServiceImp implements GameService{

	@Autowired
	private GameRepository gameRepository;
	
	@Autowired
	private GameTecnologyService gameTecnologyService;
	
	@Autowired
	private UtilsService utilsService;

	@Transactional(rollbackFor={Exception.class})
	@Override
	public Game save(GameRequest gameRequest) throws Exception {
		
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
			
			gameTecnologyService.save(gameTec);	
		}

		return gameResponse;
	}

	@Override
	public void deleteUserById(Long idGame) throws Exception {
		gameRepository.deleteById(idGame);
	}

	@Override
	public List<Game> getAllGames() {
		return gameRepository.findAll();
	}

	@Override
	public Game editValue(Game game) throws Exception {
		game.setLastUpdate(utilsService.getTime());
		return gameRepository.save(game);
	}

	@Override
	public Map<String, Object> getMostRentedGame() throws Exception {
		return gameRepository.getMostRentedGame();
	}
	
	public List<Map<String, Object>> getGamesRental(Map<String, String> request) throws Exception {	
		return gameTecnologyService.getGamesRental((request.get("hero")!= null? request.get("hero").toString() : ""), 
				(request.get("trademark")!= null? request.get("trademark").toString(): ""), 
				(request.get("director")!= null? request.get("director").toString(): ""));
	}

	@Override
	public Map<String, Object> getLessRentedGame(Integer age) throws Exception {
		Integer age10 = age + 10;
		return gameRepository.getLessRentedGame(age, age10);
	}

}
