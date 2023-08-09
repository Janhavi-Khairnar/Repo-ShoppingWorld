package com.igc.shoppingworld.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "shoppingMall")
public class ShoppingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brandName;
    private  String name;
    private Integer price;
    private Integer rating;

    public ShoppingEntity(String brandName, String name, Integer price, Integer rating) {
        this.name = brandName;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }


}
