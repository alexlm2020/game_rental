package com.pruebamatrix.api.modules.costumer.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pruebamatrix.api.modules.costumer.model.Costumer;
import com.pruebamatrix.api.modules.costumer.repository.CostumerRepository;

@Service
public class CostumerServicesImp implements CostumerServices{

	@Autowired
	private CostumerRepository costumerRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Costumer> findAll() {
		return costumerRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Costumer> findAll(Pageable pageable) {
		
		return costumerRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Costumer> findById(Long id) {
		
		return costumerRepository.findById(id);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Costumer> getAllCostumers() {		
		return costumerRepository.getAllCostumers();
	}

	@Override
	@Transactional
	public Costumer save(Costumer costumer) {		
		return costumerRepository.save(costumer);
	}

	@Override
	@Transactional
	public void deleteUserById(Long id) {	
		costumerRepository.deleteById(id);
	}

	@Override
	public Costumer getCostumerByIdentification(String identification) {
		return costumerRepository.getCostumerByIdentification(identification);
	}

}
