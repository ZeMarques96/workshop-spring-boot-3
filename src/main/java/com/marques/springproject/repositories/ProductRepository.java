package com.marques.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marques.springproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
