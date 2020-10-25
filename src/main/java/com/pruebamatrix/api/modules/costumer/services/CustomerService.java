package com.pruebamatrix.api.modules.costumer.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.pruebamatrix.api.modules.costumer.model.Customer;

public interface CustomerService {
	
	public Iterable<Customer> findAll();
	
	public Page<Customer> findAll(Pageable pageable);
	
	public Optional<Customer> findById(Long id);
	
	public Customer save(Customer costumer);
	
	public void deleteUserById(Long id);
	
	public List<Customer> getAllCostumers();
	
	public Customer getCostumerByIdentification(String identification);
}
