package com.github.sfidencio.domain.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class Product {
    @Id
    private UUID id;
    private String description;
    private BigDecimal price;
}
