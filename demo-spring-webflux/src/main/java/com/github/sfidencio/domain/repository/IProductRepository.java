package com.github.sfidencio.domain.repository;

import com.github.sfidencio.domain.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

public interface IProductRepository  extends ReactiveCrudRepository<Product, UUID> {
}
