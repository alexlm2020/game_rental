package com.pruebamatrix.api.modules.rentalGame.service;

import java.util.List;

import com.pruebamatrix.api.modules.rentalGame.model.RentalGame;

public interface RentalGameService {

	public RentalGame save (RentalGame rentalGame) throws Exception;
	
	public List<RentalGame> getRentalGame(Long idRental) throws Exception;
	
}
