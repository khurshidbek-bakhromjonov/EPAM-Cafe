package com.company.models;

import com.company.models.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private int id;
    private int userId;
    private OrderStatus orderStatus;
    private LocalDateTime orderTime;
    private LocalDateTime deliveryTime;
}
