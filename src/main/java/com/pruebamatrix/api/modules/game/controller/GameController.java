package com.pruebamatrix.api.modules.game.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pruebamatrix.api.modules.game.model.Game;
import com.pruebamatrix.api.modules.game.services.GameService;

@Controller
@RequestMapping("/api/games")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Game game) throws Exception{
		return ResponseEntity.status(HttpStatus.CREATED).body(gameService.save(game));
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<?> read (@PathVariable(value = "id") Long idGame) throws Exception {
		Optional<Game> oGame = gameService.getGame(idGame);
		if (!oGame.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oGame);
	}
	
//	@GetMapping("/getAll")
//	public ResponseEntity<?> read () throws Exception {
//		List<Game> oGames = gameService.getAllGames();
//		if (oGames.size() == 0) {
//			return ResponseEntity.notFound().build();
//		}
//		return ResponseEntity.ok(oGames);
//	}
	
}
