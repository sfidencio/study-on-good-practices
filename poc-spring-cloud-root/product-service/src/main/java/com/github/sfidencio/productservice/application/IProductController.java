package com.github.sfidencio.productservice.application;

import com.github.sfidencio.productservice.application.dto.ProductRequestDTO;
import org.springframework.http.ResponseEntity;

public interface IProductController {
    ResponseEntity<?> createProduct(ProductRequestDTO productDTO);
}
