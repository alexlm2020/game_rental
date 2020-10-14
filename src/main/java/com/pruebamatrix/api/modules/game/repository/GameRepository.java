package com.pruebamatrix.api.modules.game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pruebamatrix.api.modules.game.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game,Long>{

	@Query(value = "SELECT * FROM GAMES", nativeQuery = true)
    List<Game> getAllGames();
}
