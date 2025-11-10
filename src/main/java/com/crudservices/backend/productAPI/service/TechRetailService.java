package com.crudservices.backend.productAPI.service;

import com.crudservices.backend.productAPI.client.TechRetailClient;
import com.crudservices.backend.productAPI.model.TechRetailModel;
import com.crudservices.backend.productAPI.model.TechRetailResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class TechRetailService {

    private final TechRetailClient techRetailClient;

    public Mono<TechRetailResponse> getAllProducts() {
        return techRetailClient.getAllProducts();
    }

    public Mono<TechRetailModel> getProductById(Integer id) {
        return techRetailClient.getProductById(id);
    }

    public Mono<TechRetailResponse> searchProducts(String query) {
        return techRetailClient.searchProducts(query);
    }
}
