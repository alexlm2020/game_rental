package com.pruebamatrix.api.Utils.repository;

import java.sql.Timestamp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pruebamatrix.api.modules.costumer.model.Costumer;

@Repository
public interface UtilsRepository extends JpaRepository<Costumer,Long>{

	@Query(value = "SELECT Now()", nativeQuery = true)
    Timestamp getTime();
}
