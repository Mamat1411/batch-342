package com.xa.batch342.services;

import java.util.List;

import com.xa.batch342.entities.Category;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(Long id);
    Category saveCategory(Category category);
    void deleteCategory(Long id);
}
