package com.igc.shoppingworld.service.impl;

import com.igc.shoppingworld.entity.ShoppingEntity;
import com.igc.shoppingworld.model.ShoppingModel;
import com.igc.shoppingworld.repo.ShoppingRepo;
import com.igc.shoppingworld.service.IShoppingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingService implements IShoppingService {

    @Autowired
    ShoppingRepo shoppingRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public ShoppingModel addData(ShoppingModel shoppingModel) {
        ShoppingEntity shoppingEntity = new ShoppingEntity(shoppingModel);
        ShoppingModel shoppingModel1 = modelMapper.map(shoppingEntity,ShoppingModel.class);
        shoppingRepo.save(shoppingEntity);
        return shoppingModel1;
    }
}
