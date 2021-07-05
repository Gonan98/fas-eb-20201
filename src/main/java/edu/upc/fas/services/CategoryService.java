package edu.upc.fas.services;

import java.util.List;

import edu.upc.fas.jsons.CategoryDto;

public interface CategoryService {

    CategoryDto create(CategoryDto category);

    List<CategoryDto> getAll();

}
