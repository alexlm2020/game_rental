package com.pruebamatrix.api.modules.rental.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional(rollbackFor={Exception.class})
	@Override
	public Rental save(RentalRequest request) throws Exception {
		
		Rental rental = new Rental();
		rental.setIdCustomer(request.getIdCustomer());
		rental.setDateRental(utilsService.getTime());
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

	@Override
	public List<Map<String, Object>> getSalesDay() throws Exception {
		List<Map<String,Object>> salesDay = rentalRepository.getSalesDay();
		List<Map<String,Object>> response = new ArrayList<>();		
		for (Map<String,Object> obj :salesDay) {
			Map<String,Object> res = new HashMap<>();
			res.put("header", obj);
			res.put("detail", rentalRepository.getSalesDayGames(Long.parseLong(obj.get("idRental").toString())));
			response.add(res);
		}
		return response;
	}

}
