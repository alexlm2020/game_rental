package com.pruebamatrix.api.modules.costumer.services;

import java.util.List;
import java.util.Map;
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
	public Page<Customer> findAll(Pageable pageable) throws Exception{	
		return costumerRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Customer> findById(Long id) throws Exception{
		
		return costumerRepository.findById(id);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Customer> getAllCostumers() throws Exception{		
		return costumerRepository.getAllCostumers();
	}

	@Override
	@Transactional
	public Customer save(Customer costumer) throws Exception{		
		return costumerRepository.save(costumer);
	}

	@Override
	@Transactional
	public void deleteUserById(Long id) throws Exception{	
		costumerRepository.deleteById(id);
	}

	@Override
	public Customer getCostumerByIdentification(String identification) throws Exception{
		return costumerRepository.getCostumerByIdentification(identification);
	}

	@Override
	public Map<String, Object> getMostFrequentCustomer() throws Exception {
		return costumerRepository.getMostFrequentCustomer();
	}

}
