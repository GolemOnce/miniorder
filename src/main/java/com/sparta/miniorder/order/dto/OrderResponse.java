package com.sparta.miniorder.order.dto;

import com.sparta.miniorder.order.entity.Order;
import lombok.Getter;

@Getter
public class OrderResponse {
    private final Long orderId;
    private final Long productId;
    private final int quantity;

    public OrderResponse(Order order) {
        this.orderId = order.getId();
        this.productId = order.getProduct().getId();
        this.quantity = order.getQuantity();
    }
}
