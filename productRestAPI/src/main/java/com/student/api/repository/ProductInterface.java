package com.student.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.api.entity.Product;
@Repository
public interface ProductInterface extends JpaRepository<Product, Integer>{

	Product findByName(String name);

}
