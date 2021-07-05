package edu.upc.fas.dtos;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private Long id;
    private String name;
    private Integer stock;
    private BigDecimal price;
    private Long categoryId;
}
