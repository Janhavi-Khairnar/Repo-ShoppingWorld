package com.igc.shoppingworld;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShoppingWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingWorldApplication.class, args);
    }


    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
