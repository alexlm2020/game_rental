package com.pruebamatrix.api.modules.rental.services;

import com.pruebamatrix.api.modules.rental.model.Rental;
import com.pruebamatrix.api.modules.rental.model.RentalRequest;

public interface RentalService {
	
	public Rental save(RentalRequest rentalRequest);
}
