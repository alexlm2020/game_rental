package com.pruebamatrix.api.modules.game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pruebamatrix.api.modules.game.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game,Long>{

	@Query(value = "SELECT * FROM GAMES", nativeQuery = true)
    List<Game> getAllGames();
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO GAMES_X_TECNOLOGIES( ID_GAME, ID_TECNOLOGY, CANT ) VALUES(1?, 2?, 3?)", nativeQuery = true)
	void insertGamesTecnologies(Long idGame, Long idTecnology, Integer cant);
}
