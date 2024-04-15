package com.marques.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marques.springproject.entities.OrderItem;
import com.marques.springproject.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
