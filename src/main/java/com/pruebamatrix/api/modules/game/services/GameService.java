package com.pruebamatrix.api.modules.game.services;

import java.util.List;
import java.util.Map;

import com.pruebamatrix.api.modules.game.model.Game;
import com.pruebamatrix.api.modules.game.model.GameRequest;

public interface GameService {

	public Game save(GameRequest game) throws Exception;
	
	public void deleteUserById(Long idGame) throws Exception;
	
	public List<Game> getAllGames() throws Exception;
	
	public Game editValue(Game game) throws Exception;
	
	public Map<String,Object> getMostRentedGame() throws Exception;
	
}
