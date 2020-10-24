package com.pruebamatrix.api.modules.costumer.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebamatrix.api.modules.costumer.model.Costumer;
import com.pruebamatrix.api.modules.costumer.services.CostumerServices;

@RestController
@RequestMapping("/api/costumers")
public class CostumerController {

	@Autowired
	private CostumerServices costumerServices;
	
	// Create
	@PostMapping("/save")
	public ResponseEntity<?> create (@RequestBody Costumer costumer) {
		return ResponseEntity.status(HttpStatus.CREATED).body(costumerServices.save(costumer));	
	}
	
	@PostMapping("/getById")
	public ResponseEntity<?> read (@RequestBody Map<String, String> request) {
		Optional<Costumer> oCostumer = costumerServices.findById(Long.parseLong(request.get("idCostumer").toString()));
		if (!oCostumer.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(oCostumer);
	}
	
	@PostMapping("/getAll")
	public ResponseEntity<?> getAll () {
		List<Costumer> oCostumers = costumerServices.getAllCostumers();
		if (oCostumers.size() == 0) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oCostumers);
	}
	
	@PostMapping("/getcostumerbyidentification")
	public ResponseEntity<?> getCostumerByIdentification (@RequestBody Map<String, String> request ) {
		Costumer oCostumer = costumerServices.getCostumerByIdentification(request.get("identification").toString());
		if (oCostumer == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(costumerServices.save(oCostumer));
	}
	
}
