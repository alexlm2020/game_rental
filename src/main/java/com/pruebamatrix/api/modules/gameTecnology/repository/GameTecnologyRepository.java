package com.pruebamatrix.api.modules.gameTecnology.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebamatrix.api.modules.gameTecnology.model.GameTecnology;

@Repository
public interface GameTecnologyRepository extends JpaRepository<GameTecnology, Long> {

}
