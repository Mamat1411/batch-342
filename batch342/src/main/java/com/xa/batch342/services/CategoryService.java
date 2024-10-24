package com.xa.batch342.services;

import java.util.List;

import com.xa.batch342.dtos.requests.CategoryRequestDto;
import com.xa.batch342.dtos.responses.CategoryResponseDto;
import com.xa.batch342.entities.Category;

public interface CategoryService {
    List<CategoryResponseDto> getAllCategories();
    CategoryResponseDto getCategoryBySlug(String slug);
    Category saveCategory(CategoryRequestDto categoryRequestDto);
    void deleteCategory(String slug);
}
