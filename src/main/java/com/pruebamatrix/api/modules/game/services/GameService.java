package com.pruebamatrix.api.modules.game.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.pruebamatrix.api.modules.game.model.Game;
import com.pruebamatrix.api.modules.game.model.GameRequest;

public interface GameService {

	public Iterable<Game> findAll();
	
	public Page<Game> findAll(Pageable pageable);
	
	public Optional<Game> findById(Long idGame);
	
	public Game save(GameRequest game);
	
	public void deleteUserById(Long idGame);
	
}
