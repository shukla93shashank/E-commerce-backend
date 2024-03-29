package com.productapplication.inventoryservice.inventoryservice.repository;

import com.productapplication.inventoryservice.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    List<Inventory> findBuSkuCodeIn(List<String> skuCode);
}
