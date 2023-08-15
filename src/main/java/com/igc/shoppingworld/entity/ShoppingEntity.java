package com.igc.shoppingworld.entity;

import com.igc.shoppingworld.model.ShoppingModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "shoppingMall")
public class ShoppingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String brandName;
    private String name;
    private Integer price;
    private Integer rating;

    public ShoppingEntity(ShoppingModel shoppingModel) {
        this.brandName = shoppingModel.getBrandName();
        this.name = shoppingModel.getName();
        this.price = shoppingModel.getPrice();
        this.rating = shoppingModel.getRating();

    }
}
