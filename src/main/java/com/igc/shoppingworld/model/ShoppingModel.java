package com.igc.shoppingworld.model;

import lombok.Data;

@Data
public class ShoppingModel {            //Model = DTO {Data Transfer Object}

    private String brandName;
    private  String name;
    private Integer price;
    private Integer rating;

}
