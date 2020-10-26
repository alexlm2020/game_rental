package com.pruebamatrix.api.modules.costumer.repository;

import java.util.List;
import java.util.Map;

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
	
	@Query(value = "SELECT COUNT(1) cant, "
			+ "CONCAT(C.NAME,' ',C.LAST_NAME,' ', SECOND_LAST_NAME) fullName, "
			+ "C.IDENTIFICATION identification, "
			+ "C.PHONE phone "
			+ "FROM gamerental.RENTALS R, "
			+ "gamerental.customers C "
			+ "WHERE R.ID_CUSTOMER = C.ID_CUSTOMER "
			+ "GROUP BY C.IDENTIFICATION "
			+ "ORDER BY COUNT(R.ID_CUSTOMER) DESC "
			+ "LIMIT 1;", nativeQuery = true)
    Map<String,Object> getMostFrequentCustomer();
}
