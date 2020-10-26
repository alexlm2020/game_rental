package com.pruebamatrix.api.modules.tecnology.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.pruebamatrix.api.modules.tecnology.model.Tecnology;

public interface TecnologyService {
	
	public Iterable<Tecnology> findAll() throws Exception;
	
	public Page<Tecnology> findAll(Pageable pageable) throws Exception;
	
	public Optional<Tecnology> findById(Long idTecnology) throws Exception;
	
	public Tecnology save(Tecnology game) throws Exception;
	
	public void deleteUserById(Long idTecnology) throws Exception;
	
}
