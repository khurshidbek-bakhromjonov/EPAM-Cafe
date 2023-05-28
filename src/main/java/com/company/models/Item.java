package com.company.models;

import lombok.Getter;

@Getter
public class Item {
    private int id;
    private String name;
    private String description;
    private double weight;
    private double price;
    private Category category;
    private String image;
}
