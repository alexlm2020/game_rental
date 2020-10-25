package com.pruebamatrix.api.modules.costumer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pruebamatrix.api.modules.costumer.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
	
	@Query(value = "SELECT * FROM COSTUMERS", nativeQuery = true)
    List<Customer> getAllCostumers();
	
	@Query(value = "SELECT * FROM COSTUMERS c WHERE c.IDENTIFICATION = :identification", nativeQuery = true)
    Customer getCostumerByIdentification(@Param("identification") String identification );
}
