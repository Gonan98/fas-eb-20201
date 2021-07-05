package edu.upc.fas.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.upc.fas.dtos.CreateProductDto;
import edu.upc.fas.dtos.ProductDto;
import edu.upc.fas.entities.Category;
import edu.upc.fas.entities.Product;
import edu.upc.fas.repositories.CategoryRepository;
import edu.upc.fas.repositories.ProductRepository;
import edu.upc.fas.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    private final ModelMapper MAPPER = new ModelMapper();

    @Autowired
    private ProductRepository repository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public ProductDto create(CreateProductDto productRequest) {

        Category category = categoryRepository.findById(productRequest.getCategoryId()).orElse(null);

        Product product = new Product();
        product.setName(productRequest.getName());
        product.setStock(productRequest.getStock());
        product.setPrice(productRequest.getPrice());
        product.setCategory(category);
        product = repository.save(product);
        return MAPPER.map(product, ProductDto.class);
    }

    @Override
    public List<ProductDto> getAll() {
        List<Product> products = repository.findAll();
        return products.stream().map(p -> MAPPER.map(p, ProductDto.class)).collect(Collectors.toList());
    }

}
