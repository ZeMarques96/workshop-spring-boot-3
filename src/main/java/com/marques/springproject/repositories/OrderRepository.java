package com.marques.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marques.springproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
