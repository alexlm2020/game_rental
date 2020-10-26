package com.pruebamatrix.api.modules.rental.controller;

import java.util.List;
import java.util.Map;

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
	public ResponseEntity<?> create (@RequestBody RentalRequest request) throws Exception{
		return ResponseEntity.status(HttpStatus.CREATED).body(rentalService.save(request));	
	}
	
	@PostMapping("/getSalesDay")
	public ResponseEntity<?> getSalesDay () throws Exception{
		
		List<Map<String,Object>> requests = rentalService.getSalesDay();
		if (requests == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(requests);	
	}	
	
}
