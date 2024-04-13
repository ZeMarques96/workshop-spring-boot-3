package com.marques.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marques.springproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
