package com.productapplication.orderservice.orderservice.dto;

import com.productapplication.orderservice.orderservice.model.OrderLineItems;
import lombok.Data;

import java.util.List;

@Data
public class OrderRequest {
    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
