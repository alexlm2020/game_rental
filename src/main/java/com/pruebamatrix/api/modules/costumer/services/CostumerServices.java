package com.pruebamatrix.api.modules.costumer.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.pruebamatrix.api.modules.costumer.model.Costumer;

public interface CostumerServices {
	
	public Iterable<Costumer> findAll();
	
	public Page<Costumer> findAll(Pageable pageable);
	
	public Optional<Costumer> findById(Long id);
	
	public Costumer save(Costumer costumer);
	
	public void deleteUserById(Long id);
	
	public List<Costumer> getAllCostumers();
	
	
}
