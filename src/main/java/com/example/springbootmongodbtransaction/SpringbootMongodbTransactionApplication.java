package com.example.springbootmongodbtransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class SpringbootMongodbTransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMongodbTransactionApplication.class, args);
    }

}
