package com.igc.shoppingworld.repo;

import com.igc.shoppingworld.entity.ShoppingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingRepo extends JpaRepository<ShoppingEntity, Integer> {
}
