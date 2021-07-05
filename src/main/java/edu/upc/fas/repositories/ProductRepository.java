package edu.upc.fas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.upc.fas.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
