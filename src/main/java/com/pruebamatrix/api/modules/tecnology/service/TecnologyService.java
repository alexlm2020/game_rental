package com.pruebamatrix.api.modules.tecnology.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.pruebamatrix.api.modules.tecnology.model.Tecnology;

public interface TecnologyService {
	
	public Iterable<Tecnology> findAll();
	
	public Page<Tecnology> findAll(Pageable pageable);
	
	public Optional<Tecnology> findById(Long idTecnology);
	
	public Tecnology save(Tecnology game);
	
	public void deleteUserById(Long idTecnology);
	
}
