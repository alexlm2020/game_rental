package com.pruebamatrix.api.modules.rental.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebamatrix.api.Utils.service.UtilsService;
import com.pruebamatrix.api.modules.rental.model.Rental;
import com.pruebamatrix.api.modules.rental.model.RentalRequest;
import com.pruebamatrix.api.modules.rental.repository.RentalRepository;
import com.pruebamatrix.api.modules.rentalGame.model.RentalGame;
import com.pruebamatrix.api.modules.rentalGame.service.RentalGameService;

@Service
public class RentalServiceImp implements RentalService {

	@Autowired
	private RentalRepository rentalRepository;
	
	@Autowired
	private RentalGameService rentalGameService;
	
	@Autowired
	private UtilsService utilsService;

	@Override
	public Rental save(RentalRequest request) {
		
		Rental rental = new Rental();
		rental.setIdCustomer(request.getIdCustomer());
		rental.setDateRental(request.getDateRental());
		rental.setValue(request.getValue());
		rental.setValueIva(request.getValueIva());
		rental.setValueTotal(request.getValueTotal());
		
		Rental responseRental = rentalRepository.save(rental);
		
		for (RentalGame rg : request.getRentalGames()) {
			
			RentalGame rentalGame = new RentalGame();
			rentalGame.setIdRental(responseRental.getIdRental());
			rentalGame.setIdGameTecnology(rg.getIdGameTecnology());
			rentalGame.setValue(rg.getValue());
			rentalGame.setDateInitRental(utilsService.getTime());
			rentalGame.setDateFinishRental(rg.getDateFinishRental());

			rentalGameService.save(rentalGame);
		}	
		return responseRental;
	}

}
