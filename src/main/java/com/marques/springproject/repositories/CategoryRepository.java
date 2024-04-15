package com.marques.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marques.springproject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
