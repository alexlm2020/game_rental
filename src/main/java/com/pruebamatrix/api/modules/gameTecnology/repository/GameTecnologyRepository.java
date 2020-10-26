package com.pruebamatrix.api.modules.gameTecnology.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pruebamatrix.api.modules.gameTecnology.model.GameTecnology;

@Repository
public interface GameTecnologyRepository extends JpaRepository<GameTecnology, Long> {

	@Query(value = "SELECT GT.ID_GAME_X_TECNOLOGY idGameTecnology, "
			+ "G.NAME GAME, "
			+ "T.NAME TECNOLOGY, "
			+ "G.CURRENT_VALUE VALUE, "
			+ "G.TRADEMARK TRADEMARK, "
			+ "G.HERO HERO, "
			+ "G.DIRECTOR DIRECTOR "
			+ "FROM gamerental.GAMES_X_TECNOLOGIES GT, "
			+ "gamerental.GAMES G, "
			+ "gamerental.TECNOLOGIES T "
			+ "WHERE GT.ID_GAME = G.ID_GAME "
			+ "AND GT.ID_TECNOLOGY = T.ID_TECNOLOGY "
			+ "AND G.HERO LIKE %:hero% "
			+ "AND G.TRADEMARK LIKE %:trademark% "
			+ "AND G.DIRECTOR LIKE %:director% "
			, nativeQuery = true)
    List<Map<String, Object>> getGamesRental(
    		@Param("hero") String hero,
    		@Param("trademark") String trademark,
    		@Param("director") String director);
	
}
