package com.crudservices.backend.productAPI.model;

import lombok.Data;
import java.util.List;

@Data
public class TechRetailModel {
    private int id;
    private String title;
    private String description;
    private String category;
    private double price;
    private double discountPercentage;
    private double rating;
    private int stock;
    private List<String> tags;
}
