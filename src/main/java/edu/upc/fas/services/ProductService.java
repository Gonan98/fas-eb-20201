package edu.upc.fas.services;

import java.util.List;

import edu.upc.fas.jsons.ProductRequest;
import edu.upc.fas.jsons.ProductResponse;

public interface ProductService {

    ProductResponse create(ProductRequest productRequest);

    List<ProductResponse> getAll();
}
