package com.pruebamatrix.api.modules.costumer.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebamatrix.api.modules.costumer.model.Customer;
import com.pruebamatrix.api.modules.costumer.services.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CostumerController {

	@Autowired
	private CustomerService costumerServices;
	
	// Create
	@PostMapping("/save")
	public ResponseEntity<?> create (@RequestBody Customer costumer) throws Exception{
		return ResponseEntity.status(HttpStatus.CREATED).body(costumerServices.save(costumer));	
	}
	
	@PostMapping("/getById")
	public ResponseEntity<?> read (@RequestBody Map<String, String> request) throws Exception{
		Optional<Customer> oCostumer = costumerServices.findById(Long.parseLong(request.get("idCostumer").toString()));
		if (!oCostumer.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(oCostumer);
	}
	
	@PostMapping("/getAll")
	public ResponseEntity<?> getAll () throws Exception{
		List<Customer> oCostumers = costumerServices.getAllCostumers();
		if (oCostumers.size() == 0) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oCostumers);
	}
	
	@PostMapping("/getcostumerbyidentification")
	public ResponseEntity<?> getCostumerByIdentification (@RequestBody Map<String, String> request ) throws Exception{
		Customer oCostumer = costumerServices.getCostumerByIdentification(request.get("identification").toString());
		if (oCostumer == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(costumerServices.save(oCostumer));
	}
	
	@PostMapping("/getMostFrequentCustomer")
	public ResponseEntity<?> getMostFrequentCustomer () throws Exception{
		Map<String,Object> oCustomer = costumerServices.getMostFrequentCustomer();
		if ( oCustomer != null && Integer.parseInt(oCustomer.get("cant").toString()) == 0) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oCustomer);
	}
	
}
