package edu.upc.fas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.upc.fas.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
