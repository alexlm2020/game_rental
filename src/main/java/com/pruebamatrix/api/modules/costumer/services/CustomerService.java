package com.pruebamatrix.api.modules.costumer.services;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.pruebamatrix.api.modules.costumer.model.Customer;

public interface CustomerService {
	
	public Iterable<Customer> findAll() throws Exception;
	
	public Page<Customer> findAll(Pageable pageable) throws Exception;
	
	public Optional<Customer> findById(Long id) throws Exception;
	
	public Customer save(Customer costumer) throws Exception;
	
	public void deleteUserById(Long id) throws Exception;
	
	public List<Customer> getAllCostumers() throws Exception;
	
	public Customer getCostumerByIdentification(String identification) throws Exception;
	
	public Map<String,Object> getMostFrequentCustomer() throws Exception;
}
