package com.pruebamatrix.api.modules.rentalGame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pruebamatrix.api.modules.rentalGame.model.RentalGame;

@Repository
public interface RentalGameRepository extends JpaRepository<RentalGame,Long> {

	@Query(value = "SELECT * FROM RENTAL_GAMES WHERE ID_RENTAL = :idrental", nativeQuery = true)
    List<RentalGame> getRentalGameById(@Param("idrental") Long idRental );
	
	
	
	
}
