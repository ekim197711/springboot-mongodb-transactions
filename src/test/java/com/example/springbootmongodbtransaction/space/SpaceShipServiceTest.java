package com.example.springbootmongodbtransaction.space;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SpaceShipServiceTest {
    @Autowired
    SpaceShipService service;

    @Autowired
    SpaceShipRepository repository;

    @Test
    public void createShips() {
        repository.deleteAll();
        System.out.println("Number of docs: " + repository.count());
        try {
            service.createFirstbunchShips();
            service.createShips();
        } catch (Exception e) {
            System.out.println(e);
        }

        for (SpaceShip spaceShip : repository.findAll()) {
            System.out.println("AFTER we start the service: " + spaceShip);
        }
        System.out.println("Number of docs: " + repository.count());
    }
}