package com.pruebamatrix.api.modules.rental.services;

import java.util.List;
import java.util.Map;

import com.pruebamatrix.api.modules.rental.model.Rental;
import com.pruebamatrix.api.modules.rental.model.RentalRequest;

public interface RentalService {
	
	public Rental save(RentalRequest rentalRequest) throws Exception;
	
	public List<Map<String,Object>> getSalesDay() throws Exception;
}
