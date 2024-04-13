package com.marques.springproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marques.springproject.entities.Order;
import com.marques.springproject.repositories.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long Id){
        Optional<Order> obj = repository.findById(Id);
        return obj.get();
    } 
}
