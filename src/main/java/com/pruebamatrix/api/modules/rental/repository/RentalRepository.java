package com.pruebamatrix.api.modules.rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebamatrix.api.modules.rental.model.Rental;

@Repository
public interface RentalRepository extends JpaRepository<Rental,Long>{

}
