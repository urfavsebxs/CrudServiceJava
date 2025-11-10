package com.crudservices.backend.productAPI.client;

import com.crudservices.backend.productAPI.model.TechRetailModel;
import com.crudservices.backend.productAPI.model.TechRetailResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class TechRetailClient {

    private final WebClient.Builder webClientBuilder;

    private static final String API_URL = "https://dummyjson.com/products";

    private WebClient webClient() {
        return webClientBuilder.baseUrl(API_URL).build();
    }

    public Mono<TechRetailResponse> getAllProducts() {
        return webClient()
                .get()
                .retrieve()
                .bodyToMono(TechRetailResponse.class);
    }

    public Mono<TechRetailModel> getProductById(Integer id) {
        return webClient()
                .get()
                .uri("/{id}", id)
                .retrieve()
                .bodyToMono(TechRetailModel.class);
    }

    public Mono<TechRetailResponse> searchProducts(String query) {
        return webClient()
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("/search")
                        .queryParam("q", query)
                        .build())
                .retrieve()
                .bodyToMono(TechRetailResponse.class);
    }
}
