package com.igc.shoppingworld.service;

import com.igc.shoppingworld.entity.ShoppingEntity;
import com.igc.shoppingworld.model.ShoppingModel;

import java.util.List;


public interface IShoppingService {

    public ShoppingModel addData(ShoppingModel shoppingModel);

    public List<ShoppingEntity> getAllData();

    public String updateData(Integer id, ShoppingModel shoppingModel);

    public String deleteData(Integer id);

    public ShoppingModel getDataFromId(Integer id);
}
