package com.pruebamatrix.api.modules.game.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pruebamatrix.api.modules.game.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game,Long>{

	@Query(value = "SELECT * FROM GAMES", nativeQuery = true)
    List<Game> getAllGames();
	
	@Query(value = "SELECT COUNT(G.ID_GAME) cant, "
			+ "G.ID_GAME, "
			+ "G.NAME name "
			+ "FROM RENTAL_GAMES RG, "
			+ "GAMES_X_TECNOLOGIES GT, "
			+ "GAMES G "
			+ "WHERE G.ID_GAME = GT.ID_GAME "
			+ "AND GT.ID_GAME_X_TECNOLOGY = RG.ID_GAME_X_TECNOLOGY "
			+ "GROUP BY G.ID_GAME "
			+ "ORDER BY COUNT(G.ID_GAME) DESC "
			+ "LIMIT 1", nativeQuery = true)
    Map<String, Object> getMostRentedGame();
	
	
	@Query(value = "SELECT COUNT(G.ID_GAME) cant,  "
			+ "G.ID_GAME,  "
			+ "G.NAME name "
			+ "FROM RENTALS R, "
			+ "CUSTOMERS C, "
			+ "RENTAL_GAMES RG,  "
			+ "GAMES_X_TECNOLOGIES GT,  "
			+ "GAMES G  "
			+ "WHERE R.ID_RENTAL = RG.ID_RENTAL "
			+ "AND R.ID_CUSTOMER = C.ID_CUSTOMER  "
			+ "AND G.ID_GAME = GT.ID_GAME  "
			+ "AND GT.ID_GAME_X_TECNOLOGY = RG.ID_GAME_X_TECNOLOGY  "
			+ "AND YEAR(curdate())-YEAR(C.BIRTH_DATE) BETWEEN :age AND :age10 "
			+ "GROUP BY G.ID_GAME "
			+ "ORDER BY COUNT(G.ID_GAME) ASC "
			+ "LIMIT 1 ", nativeQuery = true)
    Map<String, Object> getLessRentedGame(@Param("age") Integer age, @Param("age10") Integer age10);
	
	
	
}
