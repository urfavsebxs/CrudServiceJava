package com.crudservices.backend.productAPI.controller;

import com.crudservices.backend.productAPI.model.TechRetailModel;
import com.crudservices.backend.productAPI.model.TechRetailResponse;
import com.crudservices.backend.productAPI.service.TechRetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class TechRetailController {

    private final TechRetailService productService;

    @GetMapping("/products")
    public Mono<TechRetailResponse> products() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Mono<TechRetailModel> getProductById(@PathVariable Integer id) {
        return productService.getProductById(id);
    }

}
