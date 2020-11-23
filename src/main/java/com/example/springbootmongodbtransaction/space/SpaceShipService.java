package com.example.springbootmongodbtransaction.space;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class SpaceShipService {
    private final SpaceShipRepository repository;

    @Transactional
    public void createShips(){
        log.info("Create SHIPS BEGIN");
        repository.save(new SpaceShip(null, "pyramid1", 77));
        repository.save(new SpaceShip(null, "pyramid2", 37));
        repository.save(new SpaceShip(null, "round1", 88));
//        if (true) {
//            throw new RuntimeException("Soimething... wopsi.");
//        }
        repository.save(new SpaceShip(null, "pyramid4", 27));
        repository.save(new SpaceShip(null, "pyramid5", 47));
        log.info("Create SHIPS END");
    }

    public void createFirstbunchShips(){
        log.info("First bunch BEGIN");
        repository.save(new SpaceShip(null, "cube1", 11));
        repository.save(new SpaceShip(null, "cube2", 22));
        log.info("First bunch END");
    }
}
