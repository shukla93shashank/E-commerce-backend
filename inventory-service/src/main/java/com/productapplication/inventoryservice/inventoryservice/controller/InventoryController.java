package com.productapplication.inventoryservice.inventoryservice.controller;

import com.productapplication.inventoryservice.inventoryservice.dto.InventoryResponse;
import com.productapplication.inventoryservice.inventoryservice.service.InventoryService;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@Data
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){

        return inventoryService.isInStock(skuCode);
    }
}
