package com.pruebamatrix.api.modules.costumer.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pruebamatrix.api.modules.costumer.model.Customer;
import com.pruebamatrix.api.modules.costumer.repository.CustomerRepository;

@Service
public class CustomerServiceImp implements CustomerService{

	@Autowired
	private CustomerRepository costumerRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Customer> findAll() {
		return costumerRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Customer> findAll(Pageable pageable) {
		
		return costumerRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Customer> findById(Long id) {
		
		return costumerRepository.findById(id);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Customer> getAllCostumers() {		
		return costumerRepository.getAllCostumers();
	}

	@Override
	@Transactional
	public Customer save(Customer costumer) {		
		return costumerRepository.save(costumer);
	}

	@Override
	@Transactional
	public void deleteUserById(Long id) {	
		costumerRepository.deleteById(id);
	}

	@Override
	public Customer getCostumerByIdentification(String identification) {
		return costumerRepository.getCostumerByIdentification(identification);
	}

}
