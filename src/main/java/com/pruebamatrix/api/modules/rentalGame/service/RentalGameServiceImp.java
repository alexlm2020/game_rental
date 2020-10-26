package com.pruebamatrix.api.modules.rentalGame.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebamatrix.api.modules.rentalGame.model.RentalGame;
import com.pruebamatrix.api.modules.rentalGame.repository.RentalGameRepository;

@Service
public class RentalGameServiceImp implements RentalGameService{

	@Autowired
	private RentalGameRepository rentaGameRepository;
	
	@Override
	public RentalGame save(RentalGame rentalGame) throws Exception{
		return rentaGameRepository.save(rentalGame);
	}

	@Override
	public List<RentalGame> getRentalGame(Long idRental) throws Exception{
		return rentaGameRepository.getRentalGameById(idRental);
	}

}
