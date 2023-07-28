package com.cglia.postcommentmappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cglia.postcommentmappings.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {



}
