package com.pruebamatrix.api.modules.rental.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pruebamatrix.api.modules.rental.model.Rental;

@Repository
public interface RentalRepository extends JpaRepository<Rental,Long>{

	@Query(value = "SELECT R.ID_RENTAL idRental, " +
			"CONCAT('Rental_', R.ID_RENTAL) codeRental, " +
			"CONCAT(C.NAME,' ',C.LAST_NAME,' ', SECOND_LAST_NAME) fullName,  " +
			"R.VALUE value, " +
			"R.VALUE_IVA valueIva, " +
			"R.VALUE_TOTAL valueTotal, " +
			"R.DATE_RENTAL dateRental " +
			"FROM gamerental.RENTALS R, " +
			"gamerental.CUSTOMERS C " +
			"WHERE R.ID_CUSTOMER = C.ID_CUSTOMER " +
			"AND R.DATE_RENTAL BETWEEN CONCAT(current_date(),' 00:00:00') AND CONCAT(current_date(),' 23:59:59') "
			, nativeQuery = true)
	List<Map<String,Object>> getSalesDay();
	
	@Query(value = "SELECT RG.ID_RENTAL idRental, "
			+ "G.NAME game, "
			+ "T.NAME tecnology, "
			+ "G.CURRENT_VALUE value, "
			+ "RG.DATE_INIT_RENTAL dateInit, "
			+ "RG.DATE_FINISH_RENTAL dateFinish "
			+ "FROM gamerental.RENTAL_GAMES RG, "
			+ "gamerental.GAMES_X_TECNOLOGIES GT, "
			+ "gamerental.GAMES G, "
			+ "gamerental.TECNOLOGIES T "
			+ "WHERE RG.ID_GAME_X_TECNOLOGY = GT.ID_GAME_X_TECNOLOGY "
			+ "AND GT.ID_GAME = G.ID_GAME "
			+ "AND GT.ID_TECNOLOGY = T.ID_TECNOLOGY "
			+ "AND RG.ID_RENTAL = :idrental "
			, nativeQuery = true)
	List<Map<String,Object>> getSalesDayGames(@Param("idrental") Long idRental);
	
	
	
}
