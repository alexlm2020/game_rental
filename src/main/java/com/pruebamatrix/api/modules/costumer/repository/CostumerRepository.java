package com.pruebamatrix.api.modules.costumer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pruebamatrix.api.modules.costumer.model.Costumer;

@Repository
public interface CostumerRepository extends JpaRepository<Costumer,Long>{
	
	@Query(value = "SELECT * FROM COSTUMERS", nativeQuery = true)
    List<Costumer> getAllCostumers();
	
}
