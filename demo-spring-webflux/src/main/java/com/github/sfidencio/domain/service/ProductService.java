package com.github.sfidencio.domain.service;

import com.github.sfidencio.application.IProductUseCase;
import com.github.sfidencio.domain.model.Product;
import com.github.sfidencio.domain.repository.IProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService implements IProductUseCase {
    private final IProductRepository productRepository;

    private List<Product> dbFake = new ArrayList<>();

    @Override
    public Mono<Product> createProduct(Product product) {
        return Mono.just(product)
                .delayElement(java.time.Duration.ofSeconds(1))
                .map(p -> {
                    p.setId(java.util.UUID.randomUUID());
                    return p;
                })
                .flatMap(productRepository::save);
    }

    @Override
    public Flux<Product> createProducts(Flux<Product> products) {
        return products
                .flatMap(this::createProduct)
                .doOnNext(product -> log.info("Product created: {}", product))
                .timeout(java.time.Duration.ofSeconds(5))
                .onErrorComplete(e -> {
                    log.error("Error creating product", e);
                    return true;
                });
    }

}
