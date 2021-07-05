package edu.upc.fas.jsons;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponse {
    private Long id;
    private String name;
    private Integer stock;
    private BigDecimal price;
    private Long categoryId;
}
