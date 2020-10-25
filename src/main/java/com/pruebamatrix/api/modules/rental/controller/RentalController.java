package com.pruebamatrix.api.modules.rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebamatrix.api.modules.rental.model.RentalRequest;
import com.pruebamatrix.api.modules.rental.services.RentalService;

@RestController
@RequestMapping("/api/rental")
public class RentalController {

	@Autowired
	private RentalService rentalService;
	// Create
	@PostMapping("/save")
	public ResponseEntity<?> create (@RequestBody RentalRequest request) {
		return ResponseEntity.status(HttpStatus.CREATED).body(rentalService.save(request));	
	}	
}
