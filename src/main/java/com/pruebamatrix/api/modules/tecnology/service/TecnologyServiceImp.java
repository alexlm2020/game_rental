package com.pruebamatrix.api.modules.tecnology.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pruebamatrix.api.modules.tecnology.model.Tecnology;
import com.pruebamatrix.api.modules.tecnology.repository.TecnologyRepository;

@Service
public class TecnologyServiceImp implements TecnologyService {

	@Autowired
	private TecnologyRepository tecnologyRepository;
	
	@Override
	public Tecnology save (Tecnology tecnology) throws Exception{
		return tecnologyRepository.save(tecnology);
	}

	@Override
	public List<Tecnology> findAll() throws Exception{
		return tecnologyRepository.findAll();
	}

	@Override
	public Page<Tecnology> findAll(Pageable pageable) throws Exception{
		return null;
	}

	@Override
	public Optional<Tecnology> findById(Long idTecnology) throws Exception{
		return tecnologyRepository.findById(idTecnology);
	}

	@Override
	public void deleteUserById(Long idTecnology) throws Exception{
		tecnologyRepository.deleteById(idTecnology);
	}
	
}
