package com.devlucasborges.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucasborges.course.entities.Product;

public interface CategoryRepository extends JpaRepository<Product, Long>{

	



}
