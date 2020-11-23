package com.example.springbootmongodbtransaction.space;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpaceShip {
    @Id
    private String id;
    private String model;
    private Integer fuel;
}
