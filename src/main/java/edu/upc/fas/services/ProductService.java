package edu.upc.fas.services;

import java.util.List;

import edu.upc.fas.dtos.CreateProductDto;
import edu.upc.fas.dtos.ProductDto;

public interface ProductService {

    ProductDto create(CreateProductDto productRequest);

    List<ProductDto> getAll();
}
