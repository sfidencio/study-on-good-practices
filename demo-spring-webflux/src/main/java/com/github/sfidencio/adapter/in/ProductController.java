package com.github.sfidencio.adapter.in;

import com.github.sfidencio.application.IProductUseCase;
import com.github.sfidencio.domain.model.Product;
import com.github.sfidencio.domain.repository.IProductRepository;
import com.github.sfidencio.domain.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products")
@Slf4j
@RequiredArgsConstructor
public class ProductController {

    private final IProductUseCase productUseCase;

    @PostMapping("/single")
    public Mono<Product> createProduct(Product product) {
        log.info("Creating product: {}", product);
        return this.productUseCase.createProduct(product);
    }

    @PostMapping
    public Flux<Product> createProduct(@RequestBody Flux<Product> products) {
        log.info("Creating multiple products");
        return this.productUseCase.createProducts(products);
    }
}
