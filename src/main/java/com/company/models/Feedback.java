package com.company.models;

import java.time.LocalDateTime;

public class Feedback {

    private int id;
    private int userId;
    private int orderId;
    private double rating;
    private String comment;
    private LocalDateTime createdAt;
}
