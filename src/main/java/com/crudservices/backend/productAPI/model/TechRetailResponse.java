package com.crudservices.backend.productAPI.model;


import lombok.Data;
import java.util.List;

@Data
public class TechRetailResponse {
    private List<TechRetailModel> products;
    private Integer total;
    private Integer skip;
    private Integer limit;
}
