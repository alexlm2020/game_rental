package com.pruebamatrix.api.modules.game.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pruebamatrix.api.modules.game.model.Game;
import com.pruebamatrix.api.modules.game.model.GameRequest;
import com.pruebamatrix.api.modules.game.services.GameServiceImp;

@Controller
@RequestMapping("/api/games")
public class GameController {

	@Autowired
	private GameServiceImp gameServiceImp;
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody GameRequest game) throws Exception{
		return ResponseEntity.status(HttpStatus.CREATED).body(gameServiceImp.save(game));
	}
	
	@PostMapping("/getAllGames")
	public ResponseEntity<?> getAllGames () throws Exception{
		List<Game> oGames = gameServiceImp.getAllGames();
		if (oGames.size() == 0) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oGames);
	}
	
	@PostMapping("/editValue")
	public ResponseEntity<?> editValue(@RequestBody Game game) throws Exception{
		return ResponseEntity.status(HttpStatus.CREATED).body(gameServiceImp.editValue(game));
	}
	
	@PostMapping("/getMostRentedGame")
	public ResponseEntity<?> getMostRentedGame () throws Exception{
		Map<String,Object> oGame = gameServiceImp.getMostRentedGame();
		if ( Integer.parseInt(oGame.get("cant").toString()) == 0) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oGame);
	}
	
	/***
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/getGamesRental")
	public ResponseEntity<?> getGamesRental (@RequestBody Map<String,String> request) throws Exception{
		List<Map<String,Object>> oGames = gameServiceImp.getGamesRental(request);
		if ( oGames.size() == 0) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oGames);
	}
	
	@PostMapping("/getLessRentedGame")
	public ResponseEntity<?> getLessRentedGame (@RequestBody Map<String,String> request) throws Exception{
		Map<String,Object> oGame = gameServiceImp.getLessRentedGame(Integer.parseInt(request.get("age").toString()));
		if ( oGame == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oGame);
	}
	
}
