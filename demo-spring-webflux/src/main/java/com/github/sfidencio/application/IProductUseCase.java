package com.github.sfidencio.application;

import com.github.sfidencio.domain.model.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProductUseCase {
    Mono<Product> createProduct(Product product);

    Flux<Product> createProducts(Flux<Product> products);
}
