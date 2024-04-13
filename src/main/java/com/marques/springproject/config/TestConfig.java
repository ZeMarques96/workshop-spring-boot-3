package com.marques.springproject.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.marques.springproject.entities.User;
import com.marques.springproject.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@mail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@mail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));


    }

}
