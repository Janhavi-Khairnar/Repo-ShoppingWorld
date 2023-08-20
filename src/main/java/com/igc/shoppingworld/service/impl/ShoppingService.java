package com.igc.shoppingworld.service.impl;

import com.igc.shoppingworld.entity.ShoppingEntity;
import com.igc.shoppingworld.model.ShoppingModel;
import com.igc.shoppingworld.repo.ShoppingRepo;
import com.igc.shoppingworld.service.IShoppingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<ShoppingEntity> getAllData() {
        return shoppingRepo.findAll();
    }

    @Override
    public String updateData(Integer id, ShoppingModel shoppingModel) {
        ShoppingEntity shoppingEntity = shoppingRepo.findById(id).get();
        if(shoppingEntity != null) {
            shoppingEntity.setBrandName(shoppingModel.getBrandName());
            shoppingEntity.setName(shoppingModel.getName());
            shoppingEntity.setPrice(shoppingModel.getPrice());
            shoppingEntity.setRating(shoppingModel.getRating());
            shoppingRepo.save(shoppingEntity);
            return "Data is updated.";
        }       else {
            return "Data is not found.";
        }
    }
}
