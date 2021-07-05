package edu.upc.fas.services.impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.upc.fas.entities.Category;
import edu.upc.fas.jsons.CategoryDto;
import edu.upc.fas.repositories.CategoryRepository;
import edu.upc.fas.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final ModelMapper MAPPER = new ModelMapper();

    @Autowired
    private CategoryRepository repository;

    @Override
    public CategoryDto create(CategoryDto categoryDto) {
        Category category = new Category();
        category.setName(categoryDto.getName());
        category = repository.save(category);
        return MAPPER.map(category, CategoryDto.class);
    }

    @Override
    public List<CategoryDto> getAll() {
        List<Category> categories = repository.findAll();
        return categories.stream().map(c -> MAPPER.map(c, CategoryDto.class)).collect(Collectors.toList());
    }

}
