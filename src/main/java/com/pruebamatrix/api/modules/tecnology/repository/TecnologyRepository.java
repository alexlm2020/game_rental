package com.pruebamatrix.api.modules.tecnology.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebamatrix.api.modules.tecnology.model.Tecnology;

@Repository
public interface TecnologyRepository extends JpaRepository<Tecnology, Long> {

}
