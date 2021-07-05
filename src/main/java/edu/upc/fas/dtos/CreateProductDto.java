package edu.upc.fas.dtos;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductDto {
    private String name;
    private Integer stock;
    private BigDecimal price;
    private Long categoryId;
}
